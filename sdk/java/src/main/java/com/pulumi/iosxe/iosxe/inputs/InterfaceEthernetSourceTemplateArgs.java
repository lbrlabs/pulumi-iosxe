// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterfaceEthernetSourceTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterfaceEthernetSourceTemplateArgs Empty = new InterfaceEthernetSourceTemplateArgs();

    @Import(name="merge")
    private @Nullable Output<Boolean> merge;

    public Optional<Output<Boolean>> merge() {
        return Optional.ofNullable(this.merge);
    }

    @Import(name="templateName", required=true)
    private Output<String> templateName;

    public Output<String> templateName() {
        return this.templateName;
    }

    private InterfaceEthernetSourceTemplateArgs() {}

    private InterfaceEthernetSourceTemplateArgs(InterfaceEthernetSourceTemplateArgs $) {
        this.merge = $.merge;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfaceEthernetSourceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfaceEthernetSourceTemplateArgs $;

        public Builder() {
            $ = new InterfaceEthernetSourceTemplateArgs();
        }

        public Builder(InterfaceEthernetSourceTemplateArgs defaults) {
            $ = new InterfaceEthernetSourceTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder merge(@Nullable Output<Boolean> merge) {
            $.merge = merge;
            return this;
        }

        public Builder merge(Boolean merge) {
            return merge(Output.of(merge));
        }

        public Builder templateName(Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        public InterfaceEthernetSourceTemplateArgs build() {
            $.templateName = Objects.requireNonNull($.templateName, "expected parameter 'templateName' to be non-null");
            return $;
        }
    }

}
