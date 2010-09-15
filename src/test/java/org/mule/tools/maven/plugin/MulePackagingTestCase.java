/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.tools.maven.plugin;

import org.apache.maven.shared.invoker.InvocationResult;

public class MulePackagingTestCase extends AbstractMuleMavenPluginTestCase
{
    public void testProjectWithMuleConfig() throws Exception
    {
        InvocationResult result = buildProject("project-with-mule-config");
        assertSuccess(result);
    }
    
    public void testProjectWithDeploymentDescriptor() throws Exception
    {
        InvocationResult result = buildProject("project-with-deployment-descriptor");
        assertSuccess(result);
    }

    public void testProjectWithEmptyAppSources() throws Exception
    {
        InvocationResult result = buildProject("project-without-config-or-deployment-descriptor");
        assertFailure(result);
    }
}