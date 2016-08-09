package nz.co.rx;

import rx.subjects.PublishSubject;

public class Main {
    public static void main(String[] args) {
        PublishSubject<Integer> subject = PublishSubject.create();
        subject.onNext(1);
        subject.subscribe(System.out::println);
        subject.onNext(2);
        subject.onNext(3);
        subject.onNext(4);
    }
}
