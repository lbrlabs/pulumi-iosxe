// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClassMapMatchActivatedServiceTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassMapMatchActivatedServiceTemplateArgs Empty = new ClassMapMatchActivatedServiceTemplateArgs();

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ClassMapMatchActivatedServiceTemplateArgs() {}

    private ClassMapMatchActivatedServiceTemplateArgs(ClassMapMatchActivatedServiceTemplateArgs $) {
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassMapMatchActivatedServiceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassMapMatchActivatedServiceTemplateArgs $;

        public Builder() {
            $ = new ClassMapMatchActivatedServiceTemplateArgs();
        }

        public Builder(ClassMapMatchActivatedServiceTemplateArgs defaults) {
            $ = new ClassMapMatchActivatedServiceTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ClassMapMatchActivatedServiceTemplateArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
