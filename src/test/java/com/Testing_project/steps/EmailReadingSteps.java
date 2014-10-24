package com.Testing_project.steps;

import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Testing_project.pages.MainMenuPage;
import com.Testing_project.pages.MyRequestsPage;

public class EmailReadingSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MainMenuPage homePage;
	MyRequestsPage myRequestsPage;

	// Accesing email, showing all emails
	@Step
	public void accesingInboxFolderFromMail(String username, String password) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			props.put("mail.imap.port", "993");
			store.connect("mail.evozon.com", username, password);

			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			Message[] messages = inbox.getMessages();

			Integer nr_messages = inbox.getMessageCount();
			// print the number of emails
			System.out.println("Number of emails is: " + nr_messages);

			String mail, subject;
			Object body;

			for (int i = 0, n = messages.length; i < n; i++) {
				Message message = messages[i];
				mail = message.getFrom()[0].toString();
				subject = message.getSubject();
				body = message.getContent();
				System.out.println("SENT FROM:" + mail);
				System.out.println("SUBJECT:" + subject);
				System.out.println("CONTENT:" + body.toString());

			}

		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

	// Accesing email, showing all emails
	@Step
	public void accesingInboxFolderLastEmail(String username, String password) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			props.put("mail.imap.port", "993");
			store.connect("mail.evozon.com", username, password);

			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			Message message = inbox.getMessage(inbox.getMessageCount());

			String mail, subject;
			Object body;

			mail = message.getFrom()[0].toString();
			subject = message.getSubject();
			body = message.getContent();
			System.out.println("SENT FROM:" + mail);
			System.out.println("SUBJECT:" + subject);
			System.out.println("CONTENT:" + body.toString());
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

	// Accesing email, showing all unread emails
	@Step
	public void accesingInboxFolderAllUnreadEmails(String username,
			String password) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			props.put("mail.imap.port", "993");
			store.connect("mail.evozon.com", username, password);

			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			Message[] messages = inbox.search(new FlagTerm(new Flags(
					Flags.Flag.SEEN), false));
			Integer nr_messages = inbox.getUnreadMessageCount();
			// print the number of unread emails
			System.out.println("Number of unread emails is: " + nr_messages);

			String mail, subject;
			Object body;
			for (int i = 0, n = messages.length; i < n; i++) {// added
				Message message = messages[i];
				System.out.println("MESSAGE #" + (i + 1) + ":");
				mail = message.getFrom()[0].toString();
				subject = message.getSubject();
				body = message.getContent();
				// bodyText = body.....
				System.out.println("SENT FROM:" + mail);
				System.out.println("SUBJECT:" + subject);
				System.out.println("CONTENT:" + body.toString());

			}
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

	// Accesing email, showing all unread emails, from a certain sender
	@Step
	public void accesingInboxFolderAllUnreadFromCertainSenderEmails(
			String username, String password, String sender) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			props.put("mail.imap.port", "993");
			store.connect("mail.evozon.com", username, password);

			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			Message[] messages = inbox.search(new FlagTerm(new Flags(
					Flags.Flag.SEEN), false));
			Integer nr_messages = inbox.getUnreadMessageCount();
			// print the number of unread emails
			System.out.println("Number of unread emails is: " + nr_messages);

			String mail, subject;
			Object body;
			for (int i = 0, n = messages.length; i < n; i++) {// added
				Message message = messages[i];
				mail = message.getFrom()[0].toString();
				subject = message.getSubject();
				body = message.getContent();
				if (mail.contentEquals(sender)) {
					System.out.println("SENT FROM:" + mail);
					System.out.println("SUBJECT:" + subject);
					System.out.println("CONTENT:" + body.toString());
				}

			}
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

	// Accesing email, showing all unread emails, from a certain sender and a
	// certain subject
	@Step
	public void accesingUnreadEmailsFromCertainSenderWithCertainSubject(
			String username, String password, String sender, String subj) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			props.put("mail.imap.port", "993");
			store.connect("mail.evozon.com", username, password);

			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			Message[] messages = inbox.search(new FlagTerm(new Flags(
					Flags.Flag.SEEN), false));
			Integer nr_messages = inbox.getUnreadMessageCount();
			// print the number of unread emails
			System.out.println("Number of unread emails is: " + nr_messages);

			String mail, subject;
			Object body;
			for (int i = 0, n = messages.length; i < n; i++) {
				Message message = messages[i];
				mail = message.getFrom()[0].toString();
				subject = message.getSubject();
				body = message.getContent();
				if (mail.contentEquals(sender)) {
					if (subject.contentEquals(subj)) {
						System.out.println("SENT FROM:" + mail);
						System.out.println("SUBJECT:" + subject);
						System.out.println("CONTENT:" + body.toString());
					}
				}

			}
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

	// Accesing email, showing all unread emails, from a certain sender and a
	// certain subject, with a certain content
	@Step
	public void accesingUnreadEmailsFromCertainSenderWithCertainSubjectAndCertainContent(String username, String password, String sender, String subj,String ver1, String ver2, String ver3) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			props.put("mail.imap.port", "993");
			store.connect("mail.evozon.com", username, password);

			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			Message[] messages = inbox.search(new FlagTerm(new Flags(
					Flags.Flag.SEEN), false));
			Integer nr_messages = inbox.getUnreadMessageCount();
			// print the number of unread emails
			System.out.println("Number of unread emails is: " + nr_messages);

			String mail, subject;
			Object body;
			for (int i = 0, n = messages.length; i < n; i++) {// added
				Message message = messages[i];
				// System.out.println("MESSAGE #" + (i + 1) + ":");
				mail = message.getFrom()[0].toString();
				subject = message.getSubject();
				body = message.getContent();
				String content;
				content = body.toString();
				// boolean test=true;
				

				if (mail.contentEquals(sender)) {
					if (subject
							.contentEquals(subj)) {

						if ((content.contains(ver1))
								&& (content.contains(ver2))
								&& (content.contains(ver3))) {
							System.out.println("SENT FROM:" + mail);
							System.out.println("SUBJECT:" + subject);
							System.out.println("CONTENT:" + content);

						}
					}
				}

			}
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

}
