package vendingmachine;

import vendingmachine.dao.VendingMachinePersistenceException;
import org.springframework.context.ApplicationContext;
import vendingmachine.controller.VendingMachineController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws VendingMachinePersistenceException {
//        UserIO myIo = new UserIOConsoleImpl();
//        VendingMachineView myView = new VendingMachineView(myIo);
//        VendingMachineDao myDao = new VendingMachineDaoFileImpl();
//        VendingMachineAudioDao myAuditDao = new VendingMachineAudioDaoFileImpl();
//        VendingMachineService myService = new VendingMachineServiceImpl(myDao, myAuditDao);
//        VendingMachineController controller = new VendingMachineController(myView, myService);
//        controller.run();

        // spring di with xml
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        VendingMachineController controller =
                ctx.getBean("controller", VendingMachineController.class);
        controller.run();

        // spring di with annotations
//        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
//        appContext.scan("com.mthree.vendingmachine");
//        appContext.refresh();
//
//        VendingMachineController controller =
//                appContext.getBean("VendingMachineController", VendingMachineController.class);
//        controller.run();
    }
}
