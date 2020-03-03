package dao.prototype;

public interface Clerker {
		void  findTicket(int tid);
		void  findUser(int uid);
		void drawer(int uid);
		void refund(int uid);
		void endorse(int uid);
		void pay(int uid);
		
}
