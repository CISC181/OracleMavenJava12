package MainPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class ManageRule {

	public static void main(String[] args) {

		ManageRule MR = new ManageRule();

		MR.listRules();
	}

	public void listRules() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		System.out.println("-----------------------------------");
		System.out.println("Listing the Rules");
		try {
			tx = session.beginTransaction();
			List rules = session.createQuery("FROM Rule").list();

			ArrayList<Rule> arrRules = new ArrayList<Rule>();

			for (Iterator iterator = rules.iterator(); iterator.hasNext();) {
				Rule rle = (Rule) iterator.next();
				System.out.println("Rule ID: " + rle.getRULE_PK());
				System.out.println("Rule MAXNUMBEROFPLAYERS: " + rle.getMAXNUMBEROFPLAYERS());
				System.out.println("Rule PLAYERNUMBEROFCARDS: " + rle.getPLAYERNUMBEROFCARDS());
				System.out.println("Rule NUMBEROFJOKERS: " + rle.getNUMBEROFJOKERS());
				System.out.println("Rule PLAYERCARDSMIN: " + rle.getPLAYERCARDSMIN());
				System.out.println("Rule PLAYERCARDSMAX: " + rle.getPLAYERCARDSMAX());
				System.out.println("Rule COMMUNITYCARDSMIN: " + rle.getCOMMUNITYCARDSMIN());
				System.out.println("Rule COMMUNITYCARDSMAX: " + rle.getCOMMUNITYCARDSMAX());
				System.out.println("Rule POSSIBLEHANDCOMBINATIONS: " + rle.getPOSSIBLEHANDCOMBINATIONS());

				arrRules.add(rle);

			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println("-----------------------------------");
	}
}
