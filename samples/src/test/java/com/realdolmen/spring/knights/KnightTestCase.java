package com.realdolmen.spring.knights;

import com.realdolmen.spring.config.KnightConfig;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by cda5732 on 31/03/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = KnightConfig.class)
public class KnightTestCase {
    @Rule
    private StandardOutputStreamLog log = new StandardOutputStreamLog();
}
