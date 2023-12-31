// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.ServiceTemplateAccessGroupArgs;
import com.pulumi.iosxe.iosxe.inputs.ServiceTemplateInterfaceTemplateArgs;
import com.pulumi.iosxe.iosxe.inputs.ServiceTemplateTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateArgs Empty = new ServiceTemplateArgs();

    /**
     * Enter a value between 1 and 1073741823 - Range: `1`-`1073741823`
     * 
     */
    @Import(name="absoluteTimer")
    private @Nullable Output<Integer> absoluteTimer;

    /**
     * @return Enter a value between 1 and 1073741823 - Range: `1`-`1073741823`
     * 
     */
    public Optional<Output<Integer>> absoluteTimer() {
        return Optional.ofNullable(this.absoluteTimer);
    }

    /**
     * Access list to be applied
     * 
     */
    @Import(name="accessGroups")
    private @Nullable Output<List<ServiceTemplateAccessGroupArgs>> accessGroups;

    /**
     * @return Access list to be applied
     * 
     */
    public Optional<Output<List<ServiceTemplateAccessGroupArgs>>> accessGroups() {
        return Optional.ofNullable(this.accessGroups);
    }

    /**
     * Enter a description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Enter a description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * pre-authentication
     * 
     */
    @Import(name="dnsAclPreauth")
    private @Nullable Output<String> dnsAclPreauth;

    /**
     * @return pre-authentication
     * 
     */
    public Optional<Output<String>> dnsAclPreauth() {
        return Optional.ofNullable(this.dnsAclPreauth);
    }

    /**
     * Enter a value between 1 and 65535 - Range: `1`-`65535`
     * 
     */
    @Import(name="ianctivityTimer")
    private @Nullable Output<Integer> ianctivityTimer;

    /**
     * @return Enter a value between 1 and 65535 - Range: `1`-`65535`
     * 
     */
    public Optional<Output<Integer>> ianctivityTimer() {
        return Optional.ofNullable(this.ianctivityTimer);
    }

    /**
     * ARP probe
     * 
     */
    @Import(name="inactivityTimerProbe")
    private @Nullable Output<Boolean> inactivityTimerProbe;

    /**
     * @return ARP probe
     * 
     */
    public Optional<Output<Boolean>> inactivityTimerProbe() {
        return Optional.ofNullable(this.inactivityTimerProbe);
    }

    /**
     * Interface template to be applied
     * 
     */
    @Import(name="interfaceTemplates")
    private @Nullable Output<List<ServiceTemplateInterfaceTemplateArgs>> interfaceTemplates;

    /**
     * @return Interface template to be applied
     * 
     */
    public Optional<Output<List<ServiceTemplateInterfaceTemplateArgs>>> interfaceTemplates() {
        return Optional.ofNullable(this.interfaceTemplates);
    }

    /**
     * Set the link security policy - Choices: `must-not-secure`, `must-secure`, `should-secure`
     * 
     */
    @Import(name="linksecPolicy")
    private @Nullable Output<String> linksecPolicy;

    /**
     * @return Set the link security policy - Choices: `must-not-secure`, `must-secure`, `should-secure`
     * 
     */
    public Optional<Output<String>> linksecPolicy() {
        return Optional.ofNullable(this.linksecPolicy);
    }

    /**
     * mdns policy to be applied
     * 
     */
    @Import(name="mdnsServicePolicy")
    private @Nullable Output<String> mdnsServicePolicy;

    /**
     * @return mdns policy to be applied
     * 
     */
    public Optional<Output<String>> mdnsServicePolicy() {
        return Optional.ofNullable(this.mdnsServicePolicy);
    }

    /**
     * Specify a template name (maximum 48 characters)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specify a template name (maximum 48 characters)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Append client Mac Address in redirect URL
     * 
     */
    @Import(name="redirectAppendClientMac")
    private @Nullable Output<String> redirectAppendClientMac;

    /**
     * @return Append client Mac Address in redirect URL
     * 
     */
    public Optional<Output<String>> redirectAppendClientMac() {
        return Optional.ofNullable(this.redirectAppendClientMac);
    }

    /**
     * Append switch Mac Address in redirect URL
     * 
     */
    @Import(name="redirectAppendSwitchMac")
    private @Nullable Output<String> redirectAppendSwitchMac;

    /**
     * @return Append switch Mac Address in redirect URL
     * 
     */
    public Optional<Output<String>> redirectAppendSwitchMac() {
        return Optional.ofNullable(this.redirectAppendSwitchMac);
    }

    /**
     * Specify a valid URL
     * 
     */
    @Import(name="redirectUrl")
    private @Nullable Output<String> redirectUrl;

    /**
     * @return Specify a valid URL
     * 
     */
    public Optional<Output<String>> redirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }

    /**
     * Specify the access list name
     * 
     */
    @Import(name="redirectUrlMatchAcl")
    private @Nullable Output<String> redirectUrlMatchAcl;

    /**
     * @return Specify the access list name
     * 
     */
    public Optional<Output<String>> redirectUrlMatchAcl() {
        return Optional.ofNullable(this.redirectUrlMatchAcl);
    }

    /**
     * - Choices: `one-time-redirect`, `redirect-on-no-match`
     * 
     */
    @Import(name="redirectUrlMatchAction")
    private @Nullable Output<String> redirectUrlMatchAction;

    /**
     * @return - Choices: `one-time-redirect`, `redirect-on-no-match`
     * 
     */
    public Optional<Output<String>> redirectUrlMatchAction() {
        return Optional.ofNullable(this.redirectUrlMatchAction);
    }

    /**
     * Configure input Qos policy
     * 
     */
    @Import(name="servicePolicyQosInput")
    private @Nullable Output<String> servicePolicyQosInput;

    /**
     * @return Configure input Qos policy
     * 
     */
    public Optional<Output<String>> servicePolicyQosInput() {
        return Optional.ofNullable(this.servicePolicyQosInput);
    }

    /**
     * Configure output Qos policy
     * 
     */
    @Import(name="servicePolicyQosOutput")
    private @Nullable Output<String> servicePolicyQosOutput;

    /**
     * @return Configure output Qos policy
     * 
     */
    public Optional<Output<String>> servicePolicyQosOutput() {
        return Optional.ofNullable(this.servicePolicyQosOutput);
    }

    /**
     * SGT tag - Range: `2`-`65519`
     * 
     */
    @Import(name="sgt")
    private @Nullable Output<Integer> sgt;

    /**
     * @return SGT tag - Range: `2`-`65519`
     * 
     */
    public Optional<Output<Integer>> sgt() {
        return Optional.ofNullable(this.sgt);
    }

    /**
     * tag name
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ServiceTemplateTagArgs>> tags;

    /**
     * @return tag name
     * 
     */
    public Optional<Output<List<ServiceTemplateTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * tunnel profile name
     * 
     */
    @Import(name="tunnelCapwapName")
    private @Nullable Output<String> tunnelCapwapName;

    /**
     * @return tunnel profile name
     * 
     */
    public Optional<Output<String>> tunnelCapwapName() {
        return Optional.ofNullable(this.tunnelCapwapName);
    }

    /**
     * Vlan to be applied - Range: `1`-`4094`
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<Integer> vlan;

    /**
     * @return Vlan to be applied - Range: `1`-`4094`
     * 
     */
    public Optional<Output<Integer>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    /**
     * Vnid to be applied
     * 
     */
    @Import(name="vnid")
    private @Nullable Output<String> vnid;

    /**
     * @return Vnid to be applied
     * 
     */
    public Optional<Output<String>> vnid() {
        return Optional.ofNullable(this.vnid);
    }

    /**
     * Critical voice vlan
     * 
     */
    @Import(name="voiceVlan")
    private @Nullable Output<Boolean> voiceVlan;

    /**
     * @return Critical voice vlan
     * 
     */
    public Optional<Output<Boolean>> voiceVlan() {
        return Optional.ofNullable(this.voiceVlan);
    }

    private ServiceTemplateArgs() {}

    private ServiceTemplateArgs(ServiceTemplateArgs $) {
        this.absoluteTimer = $.absoluteTimer;
        this.accessGroups = $.accessGroups;
        this.description = $.description;
        this.device = $.device;
        this.dnsAclPreauth = $.dnsAclPreauth;
        this.ianctivityTimer = $.ianctivityTimer;
        this.inactivityTimerProbe = $.inactivityTimerProbe;
        this.interfaceTemplates = $.interfaceTemplates;
        this.linksecPolicy = $.linksecPolicy;
        this.mdnsServicePolicy = $.mdnsServicePolicy;
        this.name = $.name;
        this.redirectAppendClientMac = $.redirectAppendClientMac;
        this.redirectAppendSwitchMac = $.redirectAppendSwitchMac;
        this.redirectUrl = $.redirectUrl;
        this.redirectUrlMatchAcl = $.redirectUrlMatchAcl;
        this.redirectUrlMatchAction = $.redirectUrlMatchAction;
        this.servicePolicyQosInput = $.servicePolicyQosInput;
        this.servicePolicyQosOutput = $.servicePolicyQosOutput;
        this.sgt = $.sgt;
        this.tags = $.tags;
        this.tunnelCapwapName = $.tunnelCapwapName;
        this.vlan = $.vlan;
        this.vnid = $.vnid;
        this.voiceVlan = $.voiceVlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateArgs $;

        public Builder() {
            $ = new ServiceTemplateArgs();
        }

        public Builder(ServiceTemplateArgs defaults) {
            $ = new ServiceTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param absoluteTimer Enter a value between 1 and 1073741823 - Range: `1`-`1073741823`
         * 
         * @return builder
         * 
         */
        public Builder absoluteTimer(@Nullable Output<Integer> absoluteTimer) {
            $.absoluteTimer = absoluteTimer;
            return this;
        }

        /**
         * @param absoluteTimer Enter a value between 1 and 1073741823 - Range: `1`-`1073741823`
         * 
         * @return builder
         * 
         */
        public Builder absoluteTimer(Integer absoluteTimer) {
            return absoluteTimer(Output.of(absoluteTimer));
        }

        /**
         * @param accessGroups Access list to be applied
         * 
         * @return builder
         * 
         */
        public Builder accessGroups(@Nullable Output<List<ServiceTemplateAccessGroupArgs>> accessGroups) {
            $.accessGroups = accessGroups;
            return this;
        }

        /**
         * @param accessGroups Access list to be applied
         * 
         * @return builder
         * 
         */
        public Builder accessGroups(List<ServiceTemplateAccessGroupArgs> accessGroups) {
            return accessGroups(Output.of(accessGroups));
        }

        /**
         * @param accessGroups Access list to be applied
         * 
         * @return builder
         * 
         */
        public Builder accessGroups(ServiceTemplateAccessGroupArgs... accessGroups) {
            return accessGroups(List.of(accessGroups));
        }

        /**
         * @param description Enter a description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Enter a description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param dnsAclPreauth pre-authentication
         * 
         * @return builder
         * 
         */
        public Builder dnsAclPreauth(@Nullable Output<String> dnsAclPreauth) {
            $.dnsAclPreauth = dnsAclPreauth;
            return this;
        }

        /**
         * @param dnsAclPreauth pre-authentication
         * 
         * @return builder
         * 
         */
        public Builder dnsAclPreauth(String dnsAclPreauth) {
            return dnsAclPreauth(Output.of(dnsAclPreauth));
        }

        /**
         * @param ianctivityTimer Enter a value between 1 and 65535 - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder ianctivityTimer(@Nullable Output<Integer> ianctivityTimer) {
            $.ianctivityTimer = ianctivityTimer;
            return this;
        }

        /**
         * @param ianctivityTimer Enter a value between 1 and 65535 - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder ianctivityTimer(Integer ianctivityTimer) {
            return ianctivityTimer(Output.of(ianctivityTimer));
        }

        /**
         * @param inactivityTimerProbe ARP probe
         * 
         * @return builder
         * 
         */
        public Builder inactivityTimerProbe(@Nullable Output<Boolean> inactivityTimerProbe) {
            $.inactivityTimerProbe = inactivityTimerProbe;
            return this;
        }

        /**
         * @param inactivityTimerProbe ARP probe
         * 
         * @return builder
         * 
         */
        public Builder inactivityTimerProbe(Boolean inactivityTimerProbe) {
            return inactivityTimerProbe(Output.of(inactivityTimerProbe));
        }

        /**
         * @param interfaceTemplates Interface template to be applied
         * 
         * @return builder
         * 
         */
        public Builder interfaceTemplates(@Nullable Output<List<ServiceTemplateInterfaceTemplateArgs>> interfaceTemplates) {
            $.interfaceTemplates = interfaceTemplates;
            return this;
        }

        /**
         * @param interfaceTemplates Interface template to be applied
         * 
         * @return builder
         * 
         */
        public Builder interfaceTemplates(List<ServiceTemplateInterfaceTemplateArgs> interfaceTemplates) {
            return interfaceTemplates(Output.of(interfaceTemplates));
        }

        /**
         * @param interfaceTemplates Interface template to be applied
         * 
         * @return builder
         * 
         */
        public Builder interfaceTemplates(ServiceTemplateInterfaceTemplateArgs... interfaceTemplates) {
            return interfaceTemplates(List.of(interfaceTemplates));
        }

        /**
         * @param linksecPolicy Set the link security policy - Choices: `must-not-secure`, `must-secure`, `should-secure`
         * 
         * @return builder
         * 
         */
        public Builder linksecPolicy(@Nullable Output<String> linksecPolicy) {
            $.linksecPolicy = linksecPolicy;
            return this;
        }

        /**
         * @param linksecPolicy Set the link security policy - Choices: `must-not-secure`, `must-secure`, `should-secure`
         * 
         * @return builder
         * 
         */
        public Builder linksecPolicy(String linksecPolicy) {
            return linksecPolicy(Output.of(linksecPolicy));
        }

        /**
         * @param mdnsServicePolicy mdns policy to be applied
         * 
         * @return builder
         * 
         */
        public Builder mdnsServicePolicy(@Nullable Output<String> mdnsServicePolicy) {
            $.mdnsServicePolicy = mdnsServicePolicy;
            return this;
        }

        /**
         * @param mdnsServicePolicy mdns policy to be applied
         * 
         * @return builder
         * 
         */
        public Builder mdnsServicePolicy(String mdnsServicePolicy) {
            return mdnsServicePolicy(Output.of(mdnsServicePolicy));
        }

        /**
         * @param name Specify a template name (maximum 48 characters)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specify a template name (maximum 48 characters)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redirectAppendClientMac Append client Mac Address in redirect URL
         * 
         * @return builder
         * 
         */
        public Builder redirectAppendClientMac(@Nullable Output<String> redirectAppendClientMac) {
            $.redirectAppendClientMac = redirectAppendClientMac;
            return this;
        }

        /**
         * @param redirectAppendClientMac Append client Mac Address in redirect URL
         * 
         * @return builder
         * 
         */
        public Builder redirectAppendClientMac(String redirectAppendClientMac) {
            return redirectAppendClientMac(Output.of(redirectAppendClientMac));
        }

        /**
         * @param redirectAppendSwitchMac Append switch Mac Address in redirect URL
         * 
         * @return builder
         * 
         */
        public Builder redirectAppendSwitchMac(@Nullable Output<String> redirectAppendSwitchMac) {
            $.redirectAppendSwitchMac = redirectAppendSwitchMac;
            return this;
        }

        /**
         * @param redirectAppendSwitchMac Append switch Mac Address in redirect URL
         * 
         * @return builder
         * 
         */
        public Builder redirectAppendSwitchMac(String redirectAppendSwitchMac) {
            return redirectAppendSwitchMac(Output.of(redirectAppendSwitchMac));
        }

        /**
         * @param redirectUrl Specify a valid URL
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(@Nullable Output<String> redirectUrl) {
            $.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * @param redirectUrl Specify a valid URL
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(String redirectUrl) {
            return redirectUrl(Output.of(redirectUrl));
        }

        /**
         * @param redirectUrlMatchAcl Specify the access list name
         * 
         * @return builder
         * 
         */
        public Builder redirectUrlMatchAcl(@Nullable Output<String> redirectUrlMatchAcl) {
            $.redirectUrlMatchAcl = redirectUrlMatchAcl;
            return this;
        }

        /**
         * @param redirectUrlMatchAcl Specify the access list name
         * 
         * @return builder
         * 
         */
        public Builder redirectUrlMatchAcl(String redirectUrlMatchAcl) {
            return redirectUrlMatchAcl(Output.of(redirectUrlMatchAcl));
        }

        /**
         * @param redirectUrlMatchAction - Choices: `one-time-redirect`, `redirect-on-no-match`
         * 
         * @return builder
         * 
         */
        public Builder redirectUrlMatchAction(@Nullable Output<String> redirectUrlMatchAction) {
            $.redirectUrlMatchAction = redirectUrlMatchAction;
            return this;
        }

        /**
         * @param redirectUrlMatchAction - Choices: `one-time-redirect`, `redirect-on-no-match`
         * 
         * @return builder
         * 
         */
        public Builder redirectUrlMatchAction(String redirectUrlMatchAction) {
            return redirectUrlMatchAction(Output.of(redirectUrlMatchAction));
        }

        /**
         * @param servicePolicyQosInput Configure input Qos policy
         * 
         * @return builder
         * 
         */
        public Builder servicePolicyQosInput(@Nullable Output<String> servicePolicyQosInput) {
            $.servicePolicyQosInput = servicePolicyQosInput;
            return this;
        }

        /**
         * @param servicePolicyQosInput Configure input Qos policy
         * 
         * @return builder
         * 
         */
        public Builder servicePolicyQosInput(String servicePolicyQosInput) {
            return servicePolicyQosInput(Output.of(servicePolicyQosInput));
        }

        /**
         * @param servicePolicyQosOutput Configure output Qos policy
         * 
         * @return builder
         * 
         */
        public Builder servicePolicyQosOutput(@Nullable Output<String> servicePolicyQosOutput) {
            $.servicePolicyQosOutput = servicePolicyQosOutput;
            return this;
        }

        /**
         * @param servicePolicyQosOutput Configure output Qos policy
         * 
         * @return builder
         * 
         */
        public Builder servicePolicyQosOutput(String servicePolicyQosOutput) {
            return servicePolicyQosOutput(Output.of(servicePolicyQosOutput));
        }

        /**
         * @param sgt SGT tag - Range: `2`-`65519`
         * 
         * @return builder
         * 
         */
        public Builder sgt(@Nullable Output<Integer> sgt) {
            $.sgt = sgt;
            return this;
        }

        /**
         * @param sgt SGT tag - Range: `2`-`65519`
         * 
         * @return builder
         * 
         */
        public Builder sgt(Integer sgt) {
            return sgt(Output.of(sgt));
        }

        /**
         * @param tags tag name
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ServiceTemplateTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags tag name
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ServiceTemplateTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags tag name
         * 
         * @return builder
         * 
         */
        public Builder tags(ServiceTemplateTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tunnelCapwapName tunnel profile name
         * 
         * @return builder
         * 
         */
        public Builder tunnelCapwapName(@Nullable Output<String> tunnelCapwapName) {
            $.tunnelCapwapName = tunnelCapwapName;
            return this;
        }

        /**
         * @param tunnelCapwapName tunnel profile name
         * 
         * @return builder
         * 
         */
        public Builder tunnelCapwapName(String tunnelCapwapName) {
            return tunnelCapwapName(Output.of(tunnelCapwapName));
        }

        /**
         * @param vlan Vlan to be applied - Range: `1`-`4094`
         * 
         * @return builder
         * 
         */
        public Builder vlan(@Nullable Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan Vlan to be applied - Range: `1`-`4094`
         * 
         * @return builder
         * 
         */
        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        /**
         * @param vnid Vnid to be applied
         * 
         * @return builder
         * 
         */
        public Builder vnid(@Nullable Output<String> vnid) {
            $.vnid = vnid;
            return this;
        }

        /**
         * @param vnid Vnid to be applied
         * 
         * @return builder
         * 
         */
        public Builder vnid(String vnid) {
            return vnid(Output.of(vnid));
        }

        /**
         * @param voiceVlan Critical voice vlan
         * 
         * @return builder
         * 
         */
        public Builder voiceVlan(@Nullable Output<Boolean> voiceVlan) {
            $.voiceVlan = voiceVlan;
            return this;
        }

        /**
         * @param voiceVlan Critical voice vlan
         * 
         * @return builder
         * 
         */
        public Builder voiceVlan(Boolean voiceVlan) {
            return voiceVlan(Output.of(voiceVlan));
        }

        public ServiceTemplateArgs build() {
            return $;
        }
    }

}
