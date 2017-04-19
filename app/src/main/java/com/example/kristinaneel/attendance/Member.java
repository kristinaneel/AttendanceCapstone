package com.example.kristinaneel.attendance;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

import java.io.Serializable;

/**
 * Created by kristinaneel on 3/6/2017.
 */
public class Member implements Serializable {
    private String memberID;
    private String memberFirstName;
    private String memberLastName;

    private String getMemberID(){return memberID;}
    public void setMemberID(String memberID){this.memberID = memberID;}

    private String getMemberFirstName(){return memberFirstName;}
    public void setMemberFirstName(String memberFirstName){this.memberFirstName = memberFirstName;}

    private String getMemberLastName(){return memberLastName;}
    public void setMemberLastName(String memberLastName){this.memberLastName = memberLastName;}

    public static Member findById (String id)
    {
        return Backendless.Data.of(Member.class).findById(id);
    }

    public static void findByIdAsync(String id, AsyncCallback<Member> callback)
    {
        Backendless.Data.of(Member.class).findById(id, callback);
    }
    public static Member findFirst()
    {
        return Backendless.Data.of(Member.class).findFirst();
    }
    public static void findFirstAsync (AsyncCallback<Member> callback)
    {
        Backendless.Data.of(Member.class).findFirst(callback);
    }
    public static Member findLast(){
        return Backendless.Data.of(Member.class).findLast();
    }
    public static void findLastAsync(AsyncCallback<Member> callback)
    {
        Backendless.Data.of(Member.class).findLast(callback);
    }
    public static BackendlessCollection<Member> find (BackendlessDataQuery query)
    {
       return Backendless.Data.of(Member.class).find(query);
    }
    public static void findAsync(BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Member>> callback)
    {
        Backendless.Data.of(Member.class).find(query,callback);
    }
    public void removeAsync(AsyncCallback<Long> callback)
    {
        Backendless.Data.of(Member.class).remove(this,callback);
    }
    public Long remove()
    {
        return Backendless.Data.of(Member.class).remove(this);
    }
    public void saveAsync(AsyncCallback<Member> callback)
    {
        Backendless.Data.of(Member.class).save(this, callback);
    }
    public Member save()
    {
        return Backendless.Data.of(Member.class).save(this);
    }



}
