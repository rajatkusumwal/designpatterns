package com.data.inn.proxypattern.accessproxy;

import com.data.inn.proxypattern.accessproxy.domain.NonOwnInvocationHandler;
import com.data.inn.proxypattern.accessproxy.domain.OwnInvocationHandler;
import com.data.inn.proxypattern.accessproxy.domain.Person;
import com.data.inn.proxypattern.accessproxy.domain.PersonImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class AccessProxyMain {

    public void run(){

        Person person = new PersonImpl("Rajat", "Male","Nothing Much!!", 0);

        // Get an Owner Proxy
        Person ownerProxyObject = getOwnerProxy(person);
        System.out.println("Name is " + ownerProxyObject.getName());
        ownerProxyObject.setInterest("Soccer");

        try{
            ownerProxyObject.setGeekRating(10);
        } catch (Exception e){
            System.out.println("Cannot set geek rating for the owner proxy :"+ e.getMessage());
        }

        System.out.println("Rating is: " + ownerProxyObject.getGeekRating() );

        // Get a non owner proxy
        Person nonOwnerProxyObject = getNonOwnerProxy(person);
        System.out.println("Name is " + ownerProxyObject.getName());
        ownerProxyObject.setInterest("Soccer");

        try{
            ownerProxyObject.setInterest("Skiing");
        } catch (Exception e){
            System.out.println("Cannot set interest for non owner proxy :"+ e.getMessage());
        }

        nonOwnerProxyObject.setGeekRating(3);
        System.out.println("Rating is set from non owner proxy." );
        System.out.println("Rating is: " + ownerProxyObject.getGeekRating() );
    }


    // These method return object proxy they can be combined by passing on the invocation interface,
    // but for ease of understanding we have kept them separate
    public Person getOwnerProxy(Person person){

        return (Person) Proxy.newProxyInstance( person.getClass().getClassLoader(),
                                                person.getClass().getInterfaces(),
                                                new OwnInvocationHandler(person) );
    }

    public Person getNonOwnerProxy(Person person){

        return (Person) Proxy.newProxyInstance( person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnInvocationHandler(person) );
    }
}
