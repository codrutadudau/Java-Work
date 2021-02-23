package com.company;

public class Main {

    public static void main(String[] args) {
        MoneyTransferModel model = new MoneyTransferModel();
        MoneyTransferModel modelFirstOwner = retrieveInformationFirstOwner();
        MoneyTransferModel modelSecondOwner = retrieveInformationSecondOwner();
        MoneyTransferView view = new MoneyTransferView();
        MoneyTransferController controller = new MoneyTransferController(model, view);
        MoneyTransferController controllerFirstOwner = new MoneyTransferController(modelFirstOwner, view);
        controllerFirstOwner.updateView();
        System.out.println(" ");
        MoneyTransferController controllerSecondOwner = new MoneyTransferController(modelSecondOwner, view);
        controllerSecondOwner.updateView();
        System.out.println(" ");
        controller.transfer(controllerFirstOwner, controllerSecondOwner, 60);
        System.out.println(" ");
        controller.updateViewCollections();
        System.out.println(" ");
        controllerFirstOwner.setOwnerName("Paul");
        controllerFirstOwner.setAccNumber(1234);
        controllerFirstOwner.setBalance(57.73);
        controllerFirstOwner.updateView();
        System.out.println(" ");
        controllerSecondOwner.setOwnerName("Ionut");
        controllerSecondOwner.setAccNumber(5678);
        controllerSecondOwner.setBalance(89.09);
        controllerSecondOwner.updateView();
        System.out.println(" ");
        controller.transfer(controllerFirstOwner, controllerSecondOwner, 20);
        System.out.println(" ");
        controller.updateViewCollections();
        System.out.println(" ");
        controller.iterateThroughCollections();

    }

    private static MoneyTransferModel retrieveInformationFirstOwner() {
        MoneyTransferModel firstOwnerDetails = new MoneyTransferModel();
        firstOwnerDetails.setOwner("Codruta");
        firstOwnerDetails.setAccNumber(1234);
        firstOwnerDetails.setBalance(123.73);
        return firstOwnerDetails;
    }

    private static MoneyTransferModel retrieveInformationSecondOwner() {
        MoneyTransferModel secondOwnerDetails = new MoneyTransferModel();
        secondOwnerDetails.setOwner("Ioana");
        secondOwnerDetails.setAccNumber(5678);
        secondOwnerDetails.setBalance(35.73);
        return secondOwnerDetails;
    }
}
