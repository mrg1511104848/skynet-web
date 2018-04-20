import java.lang.reflect.Method;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.skynet.frame.util.file.PropertiesHelper;


public class TaskManager implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		new java.lang.Thread(new Runnable() {
			
			@Override
			public void run() {
//				String className = "org.skynet.tempfetch.food.HaoDouMain";
				String className = "org.skynet.frame.base.SkynetExecutorNew";
//				String className = "org.skynet.tempfetch.qiye.chinaWK.Start";
//				String className = "org.skynet.tempfetch.qiye.soqi.StartFullFetch";
//				String className = "org.skynet.tempfetch.qiye.B2b11467CompanyDealTaskExecute";
				String method = "execute";
				/*try {
					Class cls = Class.forName(className);
					Method methodToRun = cls.getDeclaredMethod(method);
					methodToRun.invoke(cls.newInstance());
				} catch (Exception e1) {
					e1.printStackTrace();
				}  */
			}
		}).start();
		
		new java.lang.Thread(new Runnable() {
			
			@Override
			public void run() {
//				String className = "org.skynet.tempfetch.food.HaoDouMain";
				String className = "org.skynet.TaskDistributionRabbit";
//				String className = "org.skynet.tempfetch.qiye.chinaWK.Start";
//				String className = "org.skynet.tempfetch.qiye.soqi.StartFullFetch";
//				String className = "org.skynet.tempfetch.qiye.B2b11467CompanyDealTaskExecute";
				String method = "runTaskUrl";
				try {
					Class cls = Class.forName(className);
					Method methodToRun = cls.getDeclaredMethod(method);
					methodToRun.invoke(cls.newInstance());
				} catch (Exception e1) {
					e1.printStackTrace();
				}  
			}
		}).start();
	}

}
