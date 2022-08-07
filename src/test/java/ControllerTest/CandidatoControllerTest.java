package ControllerTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.empregaelas.controller.CandidatoController;
import br.com.empregaelas.domain.vo.v1.CandidatoVO;


@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class CandidatoControllerTest {
	
	@Autowired
	private CandidatoController candidatoController;
	
	@Test
	public void buscarPorIdTest() {
		CandidatoVO testeCandidato = candidatoController.findById(5L);
		assertEquals("1", testeCandidato.getKey());
		assertEquals("1", testeCandidato.getKey());
	}
	
	
	
}
