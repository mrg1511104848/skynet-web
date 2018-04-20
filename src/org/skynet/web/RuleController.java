package org.skynet.web;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.skynet.entity.Rule;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rule")
public class RuleController {
	@RequestMapping("/add.htm")
	@ResponseBody
	public Map<String, Object> add(){
		Map<String, Object> addResult = new LinkedHashMap<String, Object>();
		addResult.put("ok", true);
		return addResult;
	}
	@RequestMapping("/list.htm")
	@ResponseBody
	public List<Rule> list(){
		List<Rule> addResult = new ArrayList<Rule>();
		for (int i = 0; i < 100; i++) {
			Rule rule = new Rule();
			rule.setDesc("desc"+i);
			rule.setName("name"+i);
			rule.setRule("rule"+i);
			addResult.add(rule);
		}
		return addResult;
	}
}
