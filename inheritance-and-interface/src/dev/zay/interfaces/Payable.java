package dev.zay.interfaces;

public interface Payable {

    double calculatePay(); // no body: just the promise

    default int getTax(){
        return 5;
    }

}
