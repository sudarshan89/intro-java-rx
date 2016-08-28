package nz.co.rx;

import rx.Observable;
import rx.schedulers.Schedulers;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Observable.from(new String[]{"Hello", "Sid", "Mid"})
                .observeOn(Schedulers.io())
                .map(input -> input)
                .subscribe(onNext -> {
                            callMethod(onNext);
                        }
                ,error-> System.out.println(error));
        Thread.sleep(2000);
    }

    private static void callMethod(String onNext) {
        if(onNext.equals("Hello")){
            //throw new NullPointerException();
        }
        else {
            System.out.println(onNext);
        }
    }
}
