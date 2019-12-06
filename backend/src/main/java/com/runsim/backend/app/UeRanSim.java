package com.runsim.backend.app;

import com.runsim.backend.Constants;
import com.runsim.backend.app.sim.MtsEapAkaAttributes;
import com.runsim.backend.app.sim.MtsIEEapMessage;
import com.runsim.backend.app.sim.MtsProtocolEnumRegistry;
import com.runsim.backend.mts.MtsDecoder;
import com.runsim.backend.mts.TypeRegistry;
import com.runsim.backend.nas.eap.*;
import com.runsim.backend.utils.Console;
import com.runsim.backend.utils.Json;
import com.runsim.backend.utils.Utils;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;

public class UeRanSim {

    private static String getTypeName(Class<?> type) {
        if (type.getEnclosingClass() == null) {
            return type.getSimpleName();
        } else {
            return getTypeName(type.getEnclosingClass()) + "." + type.getSimpleName();
        }
    }

    private static void initMts() {
        try (ScanResult scanResult = new ClassGraph().enableClassInfo().ignoreClassVisibility().whitelistPackages(Constants.NAS_IMPL_PREFIX).scan()) {
            var classInfoList = scanResult.getAllClasses();
            for (var classInfo : classInfoList) {
                Class<?> clazz;
                try {
                    clazz = Class.forName(classInfo.getName());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

                String typeName = getTypeName(clazz);

                //Console.print(Color.RED, typeName + " ");
                //Console.println(Color.BLUE, clazz.getName());

                TypeRegistry.registerTypeName(typeName, clazz);
            }
        }

        final Class<?>[] eapTypes = new Class[]{
                Eap.class,
                EapAkaPrime.class,
                EapIdentity.class,
                EapNotification.class,
                EEapAkaAttributeType.class,
                EEapAkaSubType.class,
                EEapCode.class,
                EEapType.class,
        };

        for (var type : eapTypes) {
            TypeRegistry.registerTypeName(type.getSimpleName(), type);
        }

        TypeRegistry.registerCustomType(new MtsProtocolEnumRegistry());
        TypeRegistry.registerCustomType(new MtsIEEapMessage());
        TypeRegistry.registerCustomType(new MtsEapAkaAttributes());

        MtsDecoder.setFileProvider(Utils::getResourceString);
    }

    public static void main(String[] args) {
        initMts();

        var nasMessage = MtsDecoder.decode("flow1.json");
        Console.println(Json.toJson(nasMessage));
    }
}
