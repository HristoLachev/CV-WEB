package hello;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ConverterTest-context.xml")
public class SkillsPasportControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void testOnlineConverter() throws Exception {

		MockMultipartFile file = new MockMultipartFile("file", new FileInputStream(new File("src/test/resources/cv1.xml")));

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.fileUpload("/passport")
				.file(file)) 
            .andExpect(status().is(200))
            .andReturn();
		String resultAsString = result.getResponse().getContentAsString();
		System.out.println(resultAsString);
	}

}
