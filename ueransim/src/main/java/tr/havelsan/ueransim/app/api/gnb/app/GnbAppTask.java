package tr.havelsan.ueransim.app.api.gnb.app;

import tr.havelsan.ueransim.app.itms.Itms;
import tr.havelsan.ueransim.app.itms.ItmsTask;
import tr.havelsan.ueransim.app.itms.wrappers.InitialSctpReadyWrapper;
import tr.havelsan.ueransim.app.structs.simctx.GnbSimContext;

public class GnbAppTask extends ItmsTask {

    private final GnbSimContext ctx;
    private boolean initialSctpReady;

    public GnbAppTask(Itms itms, int taskId, GnbSimContext ctx) {
        super(itms, taskId);
        this.ctx = ctx;
    }

    @Override
    public void main() {
        while (true) {
            var msg = ctx.itms.receiveMessage(this);
            if (msg instanceof InitialSctpReadyWrapper) {
                initialSctpReady = true;
            }
        }
    }

    public boolean isInitialSctpReady() {
        return initialSctpReady;
    }
}
