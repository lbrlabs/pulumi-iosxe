// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.LoggingIpv4HostTransportArgs;
import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostTransportState;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv4HostTransportTransportTcpPort;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv4HostTransportTransportTlsPort;
import com.pulumi.iosxe.iosxe.outputs.LoggingIpv4HostTransportTransportUdpPort;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Logging IPv4 Host Transport configuration.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.LoggingIpv4HostTransport;
 * import com.pulumi.iosxe.iosxe.LoggingIpv4HostTransportArgs;
 * import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostTransportTransportTcpPortArgs;
 * import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostTransportTransportTlsPortArgs;
 * import com.pulumi.iosxe.iosxe.inputs.LoggingIpv4HostTransportTransportUdpPortArgs;
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
 *         var example = new LoggingIpv4HostTransport(&#34;example&#34;, LoggingIpv4HostTransportArgs.builder()        
 *             .ipv4Host(&#34;2.2.2.2&#34;)
 *             .transportTcpPorts(LoggingIpv4HostTransportTransportTcpPortArgs.builder()
 *                 .port_number(10001)
 *                 .build())
 *             .transportTlsPorts(LoggingIpv4HostTransportTransportTlsPortArgs.builder()
 *                 .port_number(10002)
 *                 .build())
 *             .transportUdpPorts(LoggingIpv4HostTransportTransportUdpPortArgs.builder()
 *                 .port_number(10000)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/loggingIpv4HostTransport:LoggingIpv4HostTransport example &#34;Cisco-IOS-XE-native:native/logging/host/ipv4-host-transport-list=2.2.2.2&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/loggingIpv4HostTransport:LoggingIpv4HostTransport")
public class LoggingIpv4HostTransport extends com.pulumi.resources.CustomResource {
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
    @Export(name="transportTcpPorts", refs={List.class,LoggingIpv4HostTransportTransportTcpPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv4HostTransportTransportTcpPort>> transportTcpPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv4HostTransportTransportTcpPort>>> transportTcpPorts() {
        return Codegen.optional(this.transportTcpPorts);
    }
    /**
     * Port Number List
     * 
     */
    @Export(name="transportTlsPorts", refs={List.class,LoggingIpv4HostTransportTransportTlsPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv4HostTransportTransportTlsPort>> transportTlsPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv4HostTransportTransportTlsPort>>> transportTlsPorts() {
        return Codegen.optional(this.transportTlsPorts);
    }
    /**
     * Port Number List
     * 
     */
    @Export(name="transportUdpPorts", refs={List.class,LoggingIpv4HostTransportTransportUdpPort.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoggingIpv4HostTransportTransportUdpPort>> transportUdpPorts;

    /**
     * @return Port Number List
     * 
     */
    public Output<Optional<List<LoggingIpv4HostTransportTransportUdpPort>>> transportUdpPorts() {
        return Codegen.optional(this.transportUdpPorts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoggingIpv4HostTransport(String name) {
        this(name, LoggingIpv4HostTransportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoggingIpv4HostTransport(String name, LoggingIpv4HostTransportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoggingIpv4HostTransport(String name, LoggingIpv4HostTransportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/loggingIpv4HostTransport:LoggingIpv4HostTransport", name, args == null ? LoggingIpv4HostTransportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoggingIpv4HostTransport(String name, Output<String> id, @Nullable LoggingIpv4HostTransportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/loggingIpv4HostTransport:LoggingIpv4HostTransport", name, state, makeResourceOptions(options, id));
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
    public static LoggingIpv4HostTransport get(String name, Output<String> id, @Nullable LoggingIpv4HostTransportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoggingIpv4HostTransport(name, id, state, options);
    }
}
