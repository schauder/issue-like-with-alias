package de.schauderhaft.likewithalias;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LikeWithAliasApplicationTests {

	@Autowired
	EntityManager em;

	@Test
	public void contextLoads() {
	}

}
