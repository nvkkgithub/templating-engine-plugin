/*
    Copyright 2018 Booz Allen Hamilton

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
package org.boozallen.plugins.jte.init.governance.config

import hudson.model.AbstractDescribableImpl
import hudson.model.Descriptor
import org.boozallen.plugins.jte.init.dsl.PipelineConfigurationObject
import org.jenkinsci.plugins.workflow.flow.FlowExecutionOwner
import org.kohsuke.stapler.DataBoundConstructor
import org.kohsuke.stapler.DataBoundSetter


abstract class PipelineConfigurationProvider extends AbstractDescribableImpl<PipelineConfigurationProvider>{

    abstract public PipelineConfigurationObject getConfig(FlowExecutionOwner owner)
    abstract public String getJenkinsfile(FlowExecutionOwner owner)
    abstract public String getTemplate(FlowExecutionOwner owner, String template)

    public static class PipelineConfigurationProviderDescriptor extends Descriptor<PipelineConfigurationProvider> {}

}