package com.yzhao.bridage;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        TV sony = new Sony();
        TV rca = new RCA();
        List<RemoteControl> remoteControls = new ArrayList<>();

        RemoteControl remoteControl1 = new ConcreteRemoteControl1(sony);

        RemoteControl remoteControl2 = new ConcreteRemoteControl1(rca);

        RemoteControl remoteControl3 = new ConcreteRemoteControl2(sony);

        RemoteControl remoteControl4 = new ConcreteRemoteControl2(rca);
        remoteControls.add(remoteControl1);
        remoteControls.add(remoteControl2);
        remoteControls.add(remoteControl3);
        remoteControls.add(remoteControl4);

        for (RemoteControl remoteControl : remoteControls) {
            remoteControl.on();
            remoteControl.off();
            remoteControl.tuneChannel();
            System.out.println("------------------------");
        }
    }
}
