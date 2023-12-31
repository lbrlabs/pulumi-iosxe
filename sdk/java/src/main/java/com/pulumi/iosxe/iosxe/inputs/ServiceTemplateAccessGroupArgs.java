// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceTemplateAccessGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateAccessGroupArgs Empty = new ServiceTemplateAccessGroupArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private ServiceTemplateAccessGroupArgs() {}

    private ServiceTemplateAccessGroupArgs(ServiceTemplateAccessGroupArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateAccessGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateAccessGroupArgs $;

        public Builder() {
            $ = new ServiceTemplateAccessGroupArgs();
        }

        public Builder(ServiceTemplateAccessGroupArgs defaults) {
            $ = new ServiceTemplateAccessGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ServiceTemplateAccessGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
