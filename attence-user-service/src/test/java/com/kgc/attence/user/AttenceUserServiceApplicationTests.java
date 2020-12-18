package com.kgc.attence.user;

import com.kgc.attence.bean.Attence;
import com.kgc.attence.service.AttenceService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class AttenceUserServiceApplicationTests {
	@Resource
	AttenceService attenceService;
	@Test
	void contextLoads() {
		List<Attence> attences=attenceService.selectAll();
		for (Attence attence : attences){
			System.out.println(attence);
		}
	}

}
