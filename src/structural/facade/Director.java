package structural.facade;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Director {
    void makeClip(int money) {
        System.out.println("Начинаем съёмки! Тишина, камера, мотор!");
        try {
            Thread.sleep(money*20);
        } catch (InterruptedException e) {}
        System.out.println("Съёмки закончены! Спасибо за работу!");
    }

}
