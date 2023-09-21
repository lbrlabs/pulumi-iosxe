// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.LoggingIpv6HostTransportArgs;
import com.pulumi.iosxe.iosxe.inputs.LoggingIpv6HostTransportState;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv6HostTransportTransportTcpPort;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv6HostTransportTransportTlsPort;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv6HostTransportTransportUdpPort;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/loggingIpv6HostTransport:LoggingIpv6HostTransport")
public class LoggingIpv6HostTransport extends com.pulumi.resources.CustomResource {
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    @Export(name="deleteMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteMode;

    /**
     * @return Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    public Output<Optional<String>> deleteMode() {
        return Codegen.optional(this.deleteMode);
    }
    /**
     * A device name from the provider configuration.
     * 
     */
    @Export(name="device", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Output<Optional<String>> device() {
        return Codegen.optional(this.device);
    }
    @Export(name="ipv6Host", refs={String.class}, tree="[0]")
    private Output<String> ipv6Host;

    public Output<String> ipv6Host() {
        return this.ipv6Host;
    }
    /**
     * Port Number List
     * 
     */
    @Export(name="transportTcpPorts", refs={List.class,LoggingIpv6HostTransportTransportTcpPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv6HostTransportTransportTcpPort>> transportTcpPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv6HostTransportTransportTcpPort>>> transportTcpPorts() {
        return Codegen.optional(this.transportTcpPorts);
    }
    /**
     * Port Number List
     * 
     */
    @Export(name="transportTlsPorts", refs={List.class,LoggingIpv6HostTransportTransportTlsPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv6HostTransportTransportTlsPort>> transportTlsPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv6HostTransportTransportTlsPort>>> transportTlsPorts() {
        return Codegen.optional(this.transportTlsPorts);
    }
    /**
     * Port Number List
     * 
     */
    @Export(name="transportUdpPorts", refs={List.class,LoggingIpv6HostTransportTransportUdpPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv6HostTransportTransportUdpPort>> transportUdpPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv6HostTransportTransportUdpPort>>> transportUdpPorts() {
        return Codegen.optional(this.transportUdpPorts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoggingIpv6HostTransport(String name) {
        this(name, LoggingIpv6HostTransportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoggingIpv6HostTransport(String name, LoggingIpv6HostTransportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoggingIpv6HostTransport(String name, LoggingIpv6HostTransportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/loggingIpv6HostTransport:LoggingIpv6HostTransport", name, args == null ? LoggingIpv6HostTransportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoggingIpv6HostTransport(String name, Output<String> id, @Nullable LoggingIpv6HostTransportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/loggingIpv6HostTransport:LoggingIpv6HostTransport", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoggingIpv6HostTransport get(String name, Output<String> id, @Nullable LoggingIpv6HostTransportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoggingIpv6HostTransport(name, id, state, options);
    }
}
