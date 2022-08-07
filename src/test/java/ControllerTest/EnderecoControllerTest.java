package ControllerTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.empregaelas.controller.EnderecoController;
import br.com.empregaelas.domain.vo.v1.EnderecoVO;


@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class EnderecoControllerTest {
	
	@Autowired
	private EnderecoController enderecoController;
	
	@Test
	public void buscarPorIdTest() {
		EnderecoVO testeEndereco = enderecoController.findById(5L);
		assertEquals("4", enderecoController.findById(4L));

	}

}