// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.LoggingIpv4HostVrfTransportArgs;
import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostVrfTransportState;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv4HostVrfTransportTransportTcpPort;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv4HostVrfTransportTransportTlsPort;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv4HostVrfTransportTransportUdpPort;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Logging IPv4 Host VRF Transport configuration.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.LoggingIpv4HostVrfTransport;
 * import com.pulumi.iosxe.iosxe.LoggingIpv4HostVrfTransportArgs;
 * import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostVrfTransportTransportTcpPortArgs;
 * import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostVrfTransportTransportTlsPortArgs;
 * import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostVrfTransportTransportUdpPortArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new LoggingIpv4HostVrfTransport(&#34;example&#34;, LoggingIpv4HostVrfTransportArgs.builder()        
 *             .ipv4Host(&#34;2.2.2.2&#34;)
 *             .transportTcpPorts(LoggingIpv4HostVrfTransportTransportTcpPortArgs.builder()
 *                 .port_number(10001)
 *                 .build())
 *             .transportTlsPorts(LoggingIpv4HostVrfTransportTransportTlsPortArgs.builder()
 *                 .port_number(10002)
 *                 .build())
 *             .transportUdpPorts(LoggingIpv4HostVrfTransportTransportUdpPortArgs.builder()
 *                 .port_number(10000)
 *                 .build())
 *             .vrf(&#34;VRF1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/loggingIpv4HostVrfTransport:LoggingIpv4HostVrfTransport example &#34;Cisco-IOS-XE-native:native/logging/host/ipv4-host-vrf-transport-list=2.2.2.2,VRF1&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/loggingIpv4HostVrfTransport:LoggingIpv4HostVrfTransport")
public class LoggingIpv4HostVrfTransport extends com.pulumi.resources.CustomResource {
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
    @Export(name="ipv4Host", refs={String.class}, tree="[0]")
    private Output<String> ipv4Host;

    public Output<String> ipv4Host() {
        return this.ipv4Host;
    }
    /**
     * Port Number List
     * 
     */
    @Export(name="transportTcpPorts", refs={List.class,LoggingIpv4HostVrfTransportTransportTcpPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv4HostVrfTransportTransportTcpPort>> transportTcpPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv4HostVrfTransportTransportTcpPort>>> transportTcpPorts() {
        return Codegen.optional(this.transportTcpPorts);
    }
    /**
     * Port Number List
     * 
     */
    @Export(name="transportTlsPorts", refs={List.class,LoggingIpv4HostVrfTransportTransportTlsPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv4HostVrfTransportTransportTlsPort>> transportTlsPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv4HostVrfTransportTransportTlsPort>>> transportTlsPorts() {
        return Codegen.optional(this.transportTlsPorts);
    }
    /**
     * Port Number List
     * 
     */
    @Export(name="transportUdpPorts", refs={List.class,LoggingIpv4HostVrfTransportTransportUdpPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv4HostVrfTransportTransportUdpPort>> transportUdpPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv4HostVrfTransportTransportUdpPort>>> transportUdpPorts() {
        return Codegen.optional(this.transportUdpPorts);
    }
    /**
     * Set VRF option
     * 
     */
    @Export(name="vrf", refs={String.class}, tree="[0]")
    private Output<String> vrf;

    /**
     * @return Set VRF option
     * 
     */
    public Output<String> vrf() {
        return this.vrf;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoggingIpv4HostVrfTransport(String name) {
        this(name, LoggingIpv4HostVrfTransportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoggingIpv4HostVrfTransport(String name, LoggingIpv4HostVrfTransportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoggingIpv4HostVrfTransport(String name, LoggingIpv4HostVrfTransportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/loggingIpv4HostVrfTransport:LoggingIpv4HostVrfTransport", name, args == null ? LoggingIpv4HostVrfTransportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoggingIpv4HostVrfTransport(String name, Output<String> id, @Nullable LoggingIpv4HostVrfTransportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/loggingIpv4HostVrfTransport:LoggingIpv4HostVrfTransport", name, state, makeResourceOptions(options, id));
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
    public static LoggingIpv4HostVrfTransport get(String name, Output<String> id, @Nullable LoggingIpv4HostVrfTransportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoggingIpv4HostVrfTransport(name, id, state, options);
    }
}
