package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class RegController extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3843225976278766228L;
	private String name;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String execute() throws Exception {

		System.out.println("name = " + name);
		System.out.println("name = " + getName());

		System.out.println("setting values at different scopes");
		
		//1. sets value for particular request
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("reqname", name);
		req.setAttribute("reqemail", email);
		req.setAttribute("reqaddress", address);

		//2. sets value for session
		HttpSession ssn = req.getSession();
		ssn.setAttribute("ssnname", name);
		ssn.setAttribute("ssnemail", email);
		ssn.setAttribute("ssnaddress", address);

		//3. sets value for particular context
		ServletContext sc = ServletActionContext.getServletContext();
		sc.setAttribute("scname", name);
		sc.setAttribute("scemail", email);
		sc.setAttribute("scaddress", address);

		//4. sets value in Value Stack
		ValueStack vs = ServletActionContext.getValueStack(req);
		Map<String, String> m = new HashMap<>();
		m.put("vsname", name);
		m.put("vsemail", email);
		m.put("vsaddress", address);

		vs.push(m);

		return "success";
	}

}
