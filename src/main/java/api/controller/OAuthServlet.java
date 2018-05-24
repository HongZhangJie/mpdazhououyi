package api.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import api.weixin.AdvancedUtil;
import api.weixin.SNSUserInfo;
import api.weixin.WeixinOauth2Token;

/**
 * Servlet implementation class OAuthServlet
 */
@WebServlet("/OAuthServlet.do")
public class OAuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OAuthServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		try {
			// �û�ͬ����Ȩ���ܻ�ȡ��code
			String code = request.getParameter("code");
			String state = request.getParameter("state");
			// �û�ͬ����Ȩ
			if (!"authdeny".equals(code)) {
				// ��ȡ��ҳ��Ȩaccess_token
				WeixinOauth2Token weixinOauth2Token = AdvancedUtil.getOauth2AccessToken("wx09cad12c2879a0a2",
						"d0a57f171e04dd73cddb8a2dc3cf4b17", code);
				// ��ҳ��Ȩ�ӿڷ���ƾ֤
				String accessToken = weixinOauth2Token.getAccessToken();
				// �û���ʶ
				String openId = weixinOauth2Token.getOpenId();
				// ��ȡ�û���Ϣ
				SNSUserInfo snsUserInfo = AdvancedUtil.getSNSUserInfo(accessToken, openId);
				// ����Ҫ���ݵĲ���
				request.setAttribute("snsUserInfo", snsUserInfo);
				request.setAttribute("state", state);
			}
			request.setAttribute("major", request.getParameter("majorname"));
			// ��ת��index.jsp
			request.getRequestDispatcher("personInfo.jsp").forward(request, response);
		} catch (Exception e) {
			request.getRequestDispatcher("infoPage/error.html").forward(request, response);
		}
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
