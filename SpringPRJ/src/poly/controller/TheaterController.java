package poly.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import poly.dto.LocalDTO;
import poly.dto.TheaterDTO;
import poly.util.CmmUtil;
import poly.util.XmlParsing_test;

@Controller
public class TheaterController {

	private Logger log = Logger.getLogger(this.getClass());
	
	/*@Resource(name="")
	private IService Service;*/
	
	@RequestMapping(value="theater/theaterSelect")
	public String theaterSelect () throws Exception{
		log.info(this.getClass() + ".theaterSelect start");
		
		
		log.info(this.getClass() + ".theaterSelect end");
		return "/theater/theaterSelect";
	}
	
	@RequestMapping(value="theater/theaterList" , method=RequestMethod.POST)
	public @ResponseBody List<TheaterDTO> test(HttpServletRequest request, Model model) throws Exception{
		log.info(this.getClass() + " .theaterList Controller start !!");
		String sido = CmmUtil.nvl(request.getParameter("sido"));
		log.info("sido : " + sido);

		String url = "http://www.kopis.or.kr/openApi/restful/prfplc?service=b0c72a78fe0b42c2a4ed40f73a1ae3ac&cpage=1&rows=1000&signgucode="+sido;
		
		DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
		Document doc = dBuilder.parse(url);
		
		doc.getDocumentElement().normalize();
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
		
		
		NodeList nList = doc.getElementsByTagName("db");
		System.out.println("파싱할 리스트 수 : " + nList.getLength());
		
		TheaterDTO tDTO = null;
		
		List<TheaterDTO> tList = new ArrayList<TheaterDTO>();
		
		for(int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				tDTO = new TheaterDTO();
				Element eElement = (Element) nNode;
				
				System.out.println("##############");
				System.out.println("fcltynm  : " + XmlParsing_test.getTagValue("fcltynm", eElement));  //공연시성명     
				System.out.println("mt10id  : " + XmlParsing_test.getTagValue("mt10id", eElement));  //공연시설 id    
				System.out.println("mt13cnt  : " + XmlParsing_test.getTagValue("mt13cnt", eElement)); //// 공연장 수
				System.out.println("fcltychartr  : " + XmlParsing_test.getTagValue("fcltychartr", eElement));// 시설 특성
				System.out.println("sidonm  : " + XmlParsing_test.getTagValue("sidonm", eElement));	//지역(시도) 
				System.out.println("gugunnm  : " + XmlParsing_test.getTagValue("gugunnm", eElement)); //지역(구군)  
				System.out.println("opende  : " + XmlParsing_test.getTagValue("opende", eElement));	//개관연도       
				   
			
		
				String fcltynm = XmlParsing_test.getTagValue("fcltynm", eElement);
				String mt10id = XmlParsing_test.getTagValue("mt10id", eElement);
				String mt13cnt = XmlParsing_test.getTagValue("mt13cnt", eElement);
				String fcltychartr = XmlParsing_test.getTagValue("fcltychartr", eElement);
				String sidonm = XmlParsing_test.getTagValue("sidonm", eElement);
				String gugunnm = XmlParsing_test.getTagValue("gugunnm", eElement);
				String opende = XmlParsing_test.getTagValue("opende", eElement);
				
				tDTO.setFcltynm(fcltynm);
				tDTO.setMt10id(mt10id);
				tDTO.setMt13cnt(mt13cnt);
				tDTO.setFcltychartr(fcltychartr);
				tDTO.setSidonm(sidonm);
				tDTO.setGugunnm(gugunnm);
				tDTO.setOpende(opende);
				
				tList.add(tDTO);
			}//if end
			
			
		}//for end
		
		System.out.println("===========================");
		for(int i =0; i < tList.size(); i++) {
			System.out.println("i : " +i);
			System.out.println(tList.get(i).getFcltynm());
			System.out.println(tList.get(i).getMt10id());
			System.out.println(tList.get(i).getMt13cnt());
			System.out.println(tList.get(i).getFcltychartr());
			System.out.println(tList.get(i).getSidonm());
			System.out.println(tList.get(i).getGugunnm());
			System.out.println(tList.get(i).getOpende());
		}
		
		model.addAttribute("tList",tList);
		
		/*
		BufferedReader br = null;
		String result = "";
		try {
			String urlstr = "http://www.kopis.or.kr/openApi/restful/prfplc?service=b0c72a78fe0b42c2a4ed40f73a1ae3ac&cpage=1&rows=1000&signgucode="+sido;
			URL url = new URL(urlstr);
			HttpURLConnection urlconnection = (HttpURLConnection)url.openConnection();
			urlconnection.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));

			String line;
			while ((line = br.readLine())!= null) {
				result = result + line + "\n";
			}
			System.out.println(result);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject)parser.parse(result);
		
		//top레벨 단계인 response 키를 가지고 데이터를 파싱합니다.
		JSONObject parse_response = (JSONObject) obj.get("response");
		//response 로 부터 body 찾아옵니다.
		System.out.println(parse_response);
		JSONObject parse_body = (JSONObject)parse_response.get("body");
		//body로 부터 items 받아옵니다.
		JSONObject parse_items = (JSONObject)parse_body.get("items");
		//item로 부터 itemlist를 받아오기 itemlist : 뒤에 [ 로 시작하므로 jsonarray이다.
		JSONArray parse_item = (JSONArray)parse_items.get("item");
		
		JSONObject resultObj;
		
		
		for(int i=0; i<parse_item.size(); i++) {
			if(resultObj.containsKey(key) == false) {
				
			}
		}
		*/
		
		
		
		
		log.info(this.getClass() + " theaterList Controller end !!");
		
		return tList;
	}
	@RequestMapping(value="theater/theaterDetail", method=RequestMethod.GET)
	public String theaterDetail (HttpServletRequest request, Model model) throws Exception{
		log.info(this.getClass() + ".theaterDetail start");
		String id = CmmUtil.nvl(request.getParameter("id"));
		log.info("id : " + id);
		
		
String url = "http://www.kopis.or.kr/openApi/restful/prfplc/"+id+"?service=b0c72a78fe0b42c2a4ed40f73a1ae3ac";
		
		DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
		Document doc = dBuilder.parse(url);
		
		doc.getDocumentElement().normalize();
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
		
		
		NodeList nList = doc.getElementsByTagName("db");
		System.out.println("파싱할 리스트 수 : " + nList.getLength());
		
		TheaterDTO tDTO = null;
		
		List<TheaterDTO> tList = new ArrayList<TheaterDTO>();
		
		for(int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				tDTO = new TheaterDTO();
				Element eElement = (Element) nNode;
				
				System.out.println("##############");
				System.out.println("fcltynm  : " + XmlParsing_test.getTagValue("fcltynm", eElement));  //공연시성명     
				System.out.println("mt10id  : " + XmlParsing_test.getTagValue("mt10id", eElement));  //공연시설 id    
				System.out.println("mt13cnt  : " + XmlParsing_test.getTagValue("mt13cnt", eElement)); //// 공연장 수
				System.out.println("fcltychartr  : " + XmlParsing_test.getTagValue("fcltychartr", eElement));// 시설 특성
				System.out.println("opende  : " + XmlParsing_test.getTagValue("opende", eElement));	//개관연도       
				System.out.println("seatscale  : " + XmlParsing_test.getTagValue("seatscale", eElement));	//객석 수
				System.out.println("telno  : " + XmlParsing_test.getTagValue("telno", eElement)); //전화번호  
				System.out.println("relateurl  : " + XmlParsing_test.getTagValue("relateurl", eElement)); //홈페이지 
				System.out.println("adres  : " + XmlParsing_test.getTagValue("adres", eElement)); //쥬소
				System.out.println("la  : " + XmlParsing_test.getTagValue("la", eElement)); //위도
				System.out.println("lo  : " + XmlParsing_test.getTagValue("lo", eElement)); //경도
				   
			
		
				String fcltynm = XmlParsing_test.getTagValue("fcltynm", eElement);
				String mt10id = XmlParsing_test.getTagValue("mt10id", eElement);
				String mt13cnt = XmlParsing_test.getTagValue("mt13cnt", eElement);
				String fcltychartr = XmlParsing_test.getTagValue("fcltychartr", eElement);
				String opende = XmlParsing_test.getTagValue("opende", eElement);
				
				String seatscale = XmlParsing_test.getTagValue("seatscale", eElement);
				String telno = XmlParsing_test.getTagValue("telno", eElement);
				String relateurl = XmlParsing_test.getTagValue("relateurl", eElement);
				String adres = XmlParsing_test.getTagValue("adres", eElement);
				String la = XmlParsing_test.getTagValue("la", eElement);
				String lo = XmlParsing_test.getTagValue("lo", eElement);
				
				tDTO.setFcltynm(fcltynm);
				tDTO.setMt10id(mt10id);
				tDTO.setMt13cnt(mt13cnt);
				tDTO.setFcltychartr(fcltychartr);
				tDTO.setOpende(opende);
				tDTO.setSeatscale(seatscale);;
				tDTO.setTelno(telno);
				tDTO.setRelateurl(relateurl);
				tDTO.setAdres(adres);
				tDTO.setLa(la);
				tDTO.setLo(lo);
				
				tList.add(tDTO);
			}//if end
			
			
		}//for end
		
		System.out.println("===========================");
		for(int i =0; i < tList.size(); i++) {
			System.out.println("i : " +i);
			System.out.println(tList.get(i).getFcltynm());
			System.out.println(tList.get(i).getMt10id());
			System.out.println(tList.get(i).getMt13cnt());
			System.out.println(tList.get(i).getFcltychartr());
			System.out.println(tList.get(i).getOpende());
			
			System.out.println(tList.get(i).getSeatscale());
			System.out.println(tList.get(i).getTelno());
			System.out.println(tList.get(i).getRelateurl());
			System.out.println(tList.get(i).getAdres());
			System.out.println(tList.get(i).getLa());
			System.out.println(tList.get(i).getLo());
		}
		
		model.addAttribute("tList",tList);
		
		log.info(this.getClass() + ".theaterDetail end");
		return "/theater/theaterDetail";
	}
}
