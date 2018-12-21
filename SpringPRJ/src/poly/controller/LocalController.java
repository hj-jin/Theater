package poly.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import poly.dto.LocalDTO;
import poly.util.CmmUtil;
import poly.util.XmlParsing_test;

@Controller
public class LocalController {

	private Logger log = Logger.getLogger(this.getClass());
	
	/*@Resource(name=)
	private IService Service;*/
	
	@RequestMapping(value="local/localSelect")
	public String localSelect(HttpServletRequest request, Model model)throws Exception{
		log.info(this.getClass() + ".localSelect start ");
		String sidoCode = CmmUtil.nvl(request.getParameter("sidoCode"));
		log.info("sidoCode : " + sidoCode);
		
		String url = "http://www.kopis.or.kr/openApi/restful/pblprfr?service=b0c72a78fe0b42c2a4ed40f73a1ae3ac&stdate=20181101&eddate=20201231&cpage=1&rows=100&prfstate=02&signgucode="+sidoCode;
		
		DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
		Document doc = dBuilder.parse(url);
		
		doc.getDocumentElement().normalize();
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
		
		
		NodeList nList = doc.getElementsByTagName("db");
		System.out.println("파싱할 리스트 수 : " + nList.getLength());
		
		LocalDTO lDTO = null;
		
		List<LocalDTO> lList = new ArrayList<LocalDTO>();
		
		for(int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				lDTO = new LocalDTO();
				Element eElement = (Element) nNode;
				
				/*System.out.println("##############");
				System.out.println("mt20id  : " + XmlParsing_test.getTagValue("mt20id", eElement));
				System.out.println("prfnm  : " + XmlParsing_test.getTagValue("prfnm", eElement));
				System.out.println("prfpdfrom  : " + XmlParsing_test.getTagValue("prfpdfrom", eElement));
				System.out.println("prfpdto  : " + XmlParsing_test.getTagValue("prfpdto", eElement));
				System.out.println("fcltynm  : " + XmlParsing_test.getTagValue("fcltynm", eElement));
				System.out.println("poster  : " + XmlParsing_test.getTagValue("poster", eElement));
				System.out.println("genrenm  : " + XmlParsing_test.getTagValue("genrenm", eElement));
				System.out.println("prfstate  : " + XmlParsing_test.getTagValue("prfstate", eElement));
				System.out.println("openrun  : " + XmlParsing_test.getTagValue("openrun", eElement));
				 */
		
				String mt20id = XmlParsing_test.getTagValue("mt20id", eElement);
				String prfnm = XmlParsing_test.getTagValue("prfnm", eElement);
				String prfpdfrom = XmlParsing_test.getTagValue("prfpdfrom", eElement);
				String prfpdto = XmlParsing_test.getTagValue("prfpdto", eElement);
				String fcltynm = XmlParsing_test.getTagValue("fcltynm", eElement);
				String poster = XmlParsing_test.getTagValue("poster", eElement);
				String genrenm = XmlParsing_test.getTagValue("genrenm", eElement);
				String prfstate = XmlParsing_test.getTagValue("prfstate", eElement);
				String openrun = XmlParsing_test.getTagValue("openrun", eElement);
				
				lDTO.setMt20id(mt20id);
				lDTO.setPrfnm(prfnm);
				lDTO.setPrfpdfrom(prfpdfrom);
				lDTO.setPoster(poster);
				lDTO.setPrfpdto(prfpdto);
				lDTO.setFcltynm(fcltynm);
				lDTO.setGenrenm(genrenm);
				lDTO.setPrfstate(prfstate);
				lDTO.setOpenrun(openrun);
				
				lList.add(lDTO);
			}//if end
			
			
		}//for end
		System.out.println("===========================");
		for(int i =0; i < lList.size(); i++) {
			System.out.println("i : " +i);
			System.out.println(lList.get(i).getMt20id());
			System.out.println(lList.get(i).getPrfnm());
			System.out.println(lList.get(i).getPrfpdfrom());
			System.out.println(lList.get(i).getPoster());
			System.out.println(lList.get(i).getPrfpdto());
			System.out.println(lList.get(i).getFcltynm());
			System.out.println(lList.get(i).getGenrenm());
			System.out.println(lList.get(i).getPrfstate());
			System.out.println(lList.get(i).getOpenrun());
		}
		
		model.addAttribute("lList",lList);
		
		log.info(this.getClass() + ".localSelect end ");
		return "/local/localList";
	}
	
	@RequestMapping(value="local/localDetail",method=RequestMethod.GET)
	public String localDetail (HttpServletRequest request , Model model) throws Exception{
		log.info(this.getClass() + ".localDetail start ");
		String id = CmmUtil.nvl(request.getParameter("id"));
		log.info("id : " + id );
		
		
String url ="http://www.kopis.or.kr/openApi/restful/pblprfr/"+id+"?service=b0c72a78fe0b42c2a4ed40f73a1ae3ac";
		
		DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
		Document doc = dBuilder.parse(url);
		
		doc.getDocumentElement().normalize();
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
		
		
		NodeList nList = doc.getElementsByTagName("db");
		System.out.println("파싱할 리스트 수 : " + nList.getLength());
		
		NodeList dList = doc.getElementsByTagName("styurl");
		System.out.println("파싱할 리스트 수 detail img : " + dList.getLength());
		
		LocalDTO lDTO = null;
		
		List<LocalDTO> lList = new ArrayList<LocalDTO>();
		
		for(int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				lDTO = new LocalDTO();
				Element eElement = (Element) nNode;
				
				System.out.println("##############");
				System.out.println("mt20id  : " + XmlParsing_test.getTagValue("mt20id", eElement));
				System.out.println("mt10id  : " + XmlParsing_test.getTagValue("mt10id", eElement));
				System.out.println("prfnm  : " + XmlParsing_test.getTagValue("prfnm", eElement));
				System.out.println("prfpdfrom  : " + XmlParsing_test.getTagValue("prfpdfrom", eElement));
				System.out.println("prfpdto  : " + XmlParsing_test.getTagValue("prfpdto", eElement));
				System.out.println("fcltynm  : " + XmlParsing_test.getTagValue("fcltynm", eElement));
				System.out.println("prfcast  : " + XmlParsing_test.getTagValue("prfcast", eElement));
				System.out.println("prfcrew  : " + XmlParsing_test.getTagValue("prfcrew", eElement));
				System.out.println("prfruntime  : " + XmlParsing_test.getTagValue("prfruntime", eElement));
				System.out.println("prfage  : " + XmlParsing_test.getTagValue("prfage", eElement));
				System.out.println("entrpsnm  : " + XmlParsing_test.getTagValue("entrpsnm", eElement));
				System.out.println("pcseguidance  : " + XmlParsing_test.getTagValue("pcseguidance", eElement));
				System.out.println("poster  : " + XmlParsing_test.getTagValue("poster", eElement));
				System.out.println("sty  : " + XmlParsing_test.getTagValue("sty", eElement));
				System.out.println("genrenm  : " + XmlParsing_test.getTagValue("genrenm", eElement));
				System.out.println("prfstate  : " + XmlParsing_test.getTagValue("prfstate", eElement));
				System.out.println("openrun  : " + XmlParsing_test.getTagValue("openrun", eElement));
				System.out.println("styurl  : " + XmlParsing_test.getTagValue("styurl", eElement));
			/*	System.out.println("styurl2  : " + XmlParsing_test.getTagValue("styurl2", eElement));
				System.out.println("styurl3  : " + XmlParsing_test.getTagValue("styurl3", eElement));
				System.out.println("styurl4  : " + XmlParsing_test.getTagValue("styurl4", eElement));
			*/	System.out.println("dtguidance  : " + XmlParsing_test.getTagValue("dtguidance", eElement));
				 
		
			
			    String mt20id  = XmlParsing_test.getTagValue("mt20id", eElement);
			    String mt10id  = XmlParsing_test.getTagValue("mt10id", eElement);
			    String prfnm  = XmlParsing_test.getTagValue("prfnm", eElement);
			    String prfpdfrom = XmlParsing_test.getTagValue("prfpdfrom", eElement);
			    String prfpdto  = XmlParsing_test.getTagValue("prfpdto", eElement);
			    String fcltynm  = XmlParsing_test.getTagValue("fcltynm", eElement);
			    String prfcast  = XmlParsing_test.getTagValue("prfcast", eElement);
			    String prfcrew  = XmlParsing_test.getTagValue("prfcrew", eElement);
			    String prfruntime= XmlParsing_test.getTagValue("prfruntime", eElement);
			    String prfage   = XmlParsing_test.getTagValue("prfage", eElement);
			    String entrpsnm  = XmlParsing_test.getTagValue("entrpsnm", eElement);
			    String pcseguidance= XmlParsing_test.getTagValue("pcseguidance", eElement);
			    String poster   = XmlParsing_test.getTagValue("poster", eElement);
			    String sty  = XmlParsing_test.getTagValue("sty", eElement);
			    String genrenm  = XmlParsing_test.getTagValue("genrenm", eElement);
			    String prfstate  = XmlParsing_test.getTagValue("prfstate", eElement);
			    String openrun  = XmlParsing_test.getTagValue("openrun", eElement);
			    String styurl   = XmlParsing_test.getTagValue("styurl", eElement);
			    String dtguidance= XmlParsing_test.getTagValue("dtguidance", eElement);
				
			    lDTO.setMt20id(mt20id);
			    lDTO.setMt10id(mt10id);
			    lDTO.setPrfnm(prfnm);
			    lDTO.setPrfpdfrom(prfpdfrom);
			    lDTO.setPrfpdto(prfpdto);
			    lDTO.setFcltynm(fcltynm);
			    lDTO.setPrfcast(prfcast);
			    lDTO.setPrfcrew(prfcrew);
			    lDTO.setPrfruntime(prfruntime);
			    lDTO.setPrfage(prfage);
			    lDTO.setEntrpsnm(entrpsnm);
			    lDTO.setPcseguidance(pcseguidance);
			    lDTO.setPoster(poster);
			    lDTO.setSty(styurl);
			    lDTO.setGenrenm(genrenm);
			    lDTO.setPrfstate(prfstate);
			    lDTO.setOpenrun(openrun);
			    lDTO.setStyurl(styurl);
			    lDTO.setDtguidance(dtguidance);
			    
				lList.add(lDTO);
			}//if end
			
			
		}//for end
		/*for(int temp = 0; temp < dList.getLength(); temp++) {
			Node dNode = dList.item(temp);
			if(dNode.getNodeType() == Node.ELEMENT_NODE) {
				lDTO = new LocalDTO();
				Element eElement = (Element) dNode;
				
				System.out.println("styurl 1 : " + XmlParsing_test.getTagValue("styurl", eElement));
				System.out.println("styurl 2  : " + XmlParsing_test.getTagValue("styurl", eElement));
				System.out.println("styurl 3 : " + XmlParsing_test.getTagValue("styurl", eElement));
				System.out.println("styurl 4  : " + XmlParsing_test.getTagValue("styurl", eElement));
			
			}//if end
		}//for end
*/		
		model.addAttribute("lList",lList);
																																																																																																																																																																																																																																																																			
		
		log.info(this.getClass() + ".localDetail end ");
		return "/local/localDetail";
	}
	
	
}
