package com.matrimony.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.matrimony.bean.Profile;
import com.matrimony.util.HibernateUtil;

public class ProfileDAOIMPL implements ProfileDAO {

	@Override
	public boolean addProfile(Profile profile) {
		
		SessionFactory factory=HibernateUtil.getSessionfactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		/*Profile setProfile=new Profile();
		setProfile.setName(profile.);*/
		session.save(profile);
		t.commit();
		session.close();
		return true;

	}

	@Override
	public List<Profile> getProfileByGender(String gender) {
		
		System.out.println("Got gender in profiledaoimpl:"+gender);
		
		SessionFactory factory=HibernateUtil.getSessionfactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Query getProfiles=session.getNamedQuery("findPeopleByGender");
		getProfiles.setString("gndr", gender);
		List<Profile> myList=getProfiles.list();
		
		return myList;
		// TODO Auto-generated method stub

	}

}
