package prog.faximon.maratonajava.javacore.ZZGconcorrencia.test;

import prog.faximon.maratonajava.javacore.ZZGconcorrencia.dominio.Members;
import prog.faximon.maratonajava.javacore.ZZGconcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();
        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}