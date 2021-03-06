/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.arquillian.extension.decoder.configuration;

import org.arquillian.extension.decoder.api.DecoderConfigurationException;
import org.arquillian.extension.decoder.configuration.DecoderConfiguration;
import org.hamcrest.junit.ExpectedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author <a href="mailto:smikloso@redhat.com">Stefan Miklosovic</a>
 *
 */
@RunWith(JUnit4.class)
public class DecoderConfigurationTest
{
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testDecoderConfiguration() throws Exception
    {
        exception.expect(DecoderConfigurationException.class);

        DecoderConfiguration configuration = new DecoderConfiguration();

        configuration.setIgnore(true);
        configuration.setIgnoreOnly("some.decoder.annotation.class.name");

        configuration.validate();
    }

}
