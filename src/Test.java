import java.util.HashSet;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernate5.bean.Category;
import com.hibernate5.bean.Order;
import com.hibernate5.bean.OrderItem;
import com.hibernate5.bean.User;

public class Test {

	/*
	 * public static void main(String[] args) { Configuration configuration =
	 * new Configuration().configure("hibernate.cfg.xml"); ServiceRegistry
	 * serviceRegistry = new
	 * ServiceRegistryBuilder().applySettings(configuration.getProperties())
	 * .buildServiceRegistry(); SessionFactory sessionFactory =
	 * configuration.buildSessionFactory(serviceRegistry);
	 * 
	 * Session session = sessionFactory.openSession();
	 * session.beginTransaction();
	 * 
	 * Query query = session.createQuery("FROM User Where id = ?");
	 * query.setInteger(0, 1); List<User> users = query.list();
	 * 
	 * for (User user : users) { System.out.println(user.getId() + "==" +
	 * user.getName()); }
	 * 
	 * session.close(); sessionFactory.close(); }
	 */

	/*
	 * public static void main(String[] args) { Configuration configuration =
	 * new Configuration().configure("hibernate.cfg.xml"); ServiceRegistry
	 * serviceRegistry = new
	 * ServiceRegistryBuilder().applySettings(configuration.getProperties()).
	 * buildServiceRegistry();
	 * 
	 * SessionFactory sessionFactory =
	 * configuration.buildSessionFactory(serviceRegistry); Session session =
	 * sessionFactory.openSession(); Transaction transaction =
	 * session.beginTransaction();
	 * 
	 * User user = new User(); user.setName("你好 世界"); Integer id = (Integer)
	 * session.save(user);
	 * 
	 * transaction.commit();
	 * 
	 * session.close(); sessionFactory.close();
	 * 
	 * System.out.println(id); }
	 */

	/*
	 * public static void main(String[] args) { Configuration configuration =
	 * new Configuration().configure("hibernate.cfg.xml"); ServiceRegistry
	 * serviceRegistry = new
	 * ServiceRegistryBuilder().applySettings(configuration.getProperties())
	 * .buildServiceRegistry(); SessionFactory sessionFactory =
	 * configuration.buildSessionFactory(serviceRegistry); Session session =
	 * sessionFactory.openSession(); Transaction transaction =
	 * session.beginTransaction();
	 * 
	 * Order order = new Order(); order.setSn("snxx123456"); Date date = new
	 * Date(); SimpleDateFormat simpleDateFormat = new
	 * SimpleDateFormat("yyyy-MM-dd"); String createTime =
	 * simpleDateFormat.format(date); order.setCreateTime(createTime); OrderItem
	 * orderItem1 = new OrderItem(); orderItem1.setName("hello1");
	 * orderItem1.setOrder(order);
	 * 
	 * OrderItem orderItem2 = new OrderItem(); orderItem2.setName("hello2");
	 * orderItem2.setOrder(order);
	 * 
	 * Set<OrderItem> orderItems = new HashSet<OrderItem>();
	 * orderItems.add(orderItem1); orderItems.add(orderItem2);
	 * order.setOrderItem(orderItems);
	 * 
	 * session.save(order); transaction.commit();
	 * 
	 * session.close(); sessionFactory.close(); }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	 * ServiceRegistry registry = new
	 * ServiceRegistryBuilder().applySettings(cfg.getProperties()).
	 * buildServiceRegistry(); SessionFactory factory =
	 * cfg.buildSessionFactory(registry);; Session session =
	 * factory.openSession();
	 * 
	 * Query query = session.createQuery("FROM Order WHERE id = ?");
	 * query.setInteger(0, 4); Order order = (Order) query.uniqueResult();
	 * System.out.println(order.getId() + "==" + order.getSn()); Set<OrderItem>
	 * orderItems = order.getOrderItem(); for (OrderItem orderItem : orderItems)
	 * { System.out.println(orderItem.getName()); }
	 * 
	 * session.close(); factory.close(); }
	 */

	/*
	 * public static void main(String[] args) { Configuration cfg = new
	 * Configuration().configure("hibernate.cfg.xml"); ServiceRegistry
	 * serviceRegistry = new
	 * ServiceRegistryBuilder().applySettings(cfg.getProperties()).
	 * buildServiceRegistry(); SessionFactory sessionFactory =
	 * cfg.buildSessionFactory(serviceRegistry); Session session =
	 * sessionFactory.openSession(); Transaction transaction =
	 * session.beginTransaction();
	 * 
	 * User user = new User(); user.setName("baochengxue");
	 * 
	 * Set<Order> orders = new HashSet<Order>(); Order order = new Order();
	 * order.setSn("btime1213456"); order.setUser(user); Set<OrderItem>
	 * orderItems = new HashSet<OrderItem>(); OrderItem orderItem = new
	 * OrderItem(); orderItem.setName("苹果7 128G"); orderItem.setOrder(order);
	 * orderItems.add(orderItem); order.setOrderItem(orderItems);
	 * 
	 * 
	 * orders.add(order); user.setOrders(orders);
	 * 
	 * // session.save(order); session.save(user); transaction.commit();
	 * 
	 * session.close(); sessionFactory.close();
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { Configuration cfg = new
	 * Configuration().configure("hibernate.cfg.xml"); ServiceRegistry
	 * serviceRegistry = new
	 * ServiceRegistryBuilder().applySettings(cfg.getProperties()).
	 * buildServiceRegistry(); SessionFactory sessionFactory =
	 * cfg.buildSessionFactory(serviceRegistry); Session session =
	 * sessionFactory.openSession(); Transaction transaction =
	 * session.beginTransaction();
	 * 
	 * Query query = session.createQuery("FROM User where id = 12"); User user =
	 * (User) query.uniqueResult(); session.delete(user); transaction.commit();
	 * 
	 * session.close(); sessionFactory.close(); }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * Category category = new Category(); category.setName("娱乐");
	 * 
	 * Category childCategory = new Category(); childCategory.setName("明星资讯");
	 * childCategory.setParentCategory(category);
	 * 
	 * Set<Category> childCategories = new HashSet<Category>();
	 * childCategories.add(childCategory);
	 * category.setChildCategories(childCategories);
	 * 
	 * Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	 * ServiceRegistry serviceRegistry = new
	 * ServiceRegistryBuilder().applySettings(cfg.getProperties()).
	 * buildServiceRegistry(); SessionFactory sessionFactory =
	 * cfg.buildSessionFactory(serviceRegistry); Session session =
	 * sessionFactory.openSession(); Transaction transaction =
	 * session.beginTransaction();
	 * 
	 * session.save(category); transaction.commit(); session.close();
	 * sessionFactory.close(); }
	 */

	/*
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();

		Category category = (Category) session.load(Category.class, (Integer) 1);
		System.out.println(category.getName());
		Set<Category> categories = category.getChildCategories();
		
		for (Category c : categories)
		{
			System.out.println(c.getName());
		}
		
		session.close();
		sessionFactory.close();
	}
	*/
}
