/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.poc.api.exception;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.module.poc.api.common.exception.POCBusinessException;
import org.openmrs.test.BaseModuleContextSensitiveTest;

public class POCBusinessExceptionTest extends BaseModuleContextSensitiveTest {
	
	@Test
	public void shouldCreateExceptionWithThrowableParameter() {
		
		final POCBusinessException pocBusinessException = new POCBusinessException(new Exception());
		
		Assert.assertNotNull(pocBusinessException);
	}
	
	@Test
	public void shouldCreateExceptionWithMessageKyeAndThrowableParam() {
		
		final POCBusinessException pocBusinessException = new POCBusinessException("empty.message.key",
		        new Exception());
		
		Assert.assertNotNull(pocBusinessException);
	}
}
