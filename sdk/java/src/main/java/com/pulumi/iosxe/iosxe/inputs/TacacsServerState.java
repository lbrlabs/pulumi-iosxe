// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TacacsServerState extends com.pulumi.resources.ResourceArgs {

    public static final TacacsServerState Empty = new TacacsServerState();

    /**
     * IPv4 address or Hostname for tacacs server
     * 
     */
    @Import(name="addressIpv4")
    private @Nullable Output<String> addressIpv4;

    /**
     * @return IPv4 address or Hostname for tacacs server
     * 
     */
    public Optional<Output<String>> addressIpv4() {
        return Optional.ofNullable(this.addressIpv4);
    }

    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    @Import(name="deleteMode")
    private @Nullable Output<String> deleteMode;

    /**
     * @return Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    public Optional<Output<String>> deleteMode() {
        return Optional.ofNullable(this.deleteMode);
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
     * The UNENCRYPTED (cleartext) server key
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The UNENCRYPTED (cleartext) server key
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Name for the tacacs server configuration
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for the tacacs server configuration
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Time to wait for this TACACS server to reply (overrides default) - Range: `1`-`1000`
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Time to wait for this TACACS server to reply (overrides default) - Range: `1`-`1000`
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private TacacsServerState() {}

    private TacacsServerState(TacacsServerState $) {
        this.addressIpv4 = $.addressIpv4;
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.key = $.key;
        this.name = $.name;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TacacsServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TacacsServerState $;

        public Builder() {
            $ = new TacacsServerState();
        }

        public Builder(TacacsServerState defaults) {
            $ = new TacacsServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressIpv4 IPv4 address or Hostname for tacacs server
         * 
         * @return builder
         * 
         */
        public Builder addressIpv4(@Nullable Output<String> addressIpv4) {
            $.addressIpv4 = addressIpv4;
            return this;
        }

        /**
         * @param addressIpv4 IPv4 address or Hostname for tacacs server
         * 
         * @return builder
         * 
         */
        public Builder addressIpv4(String addressIpv4) {
            return addressIpv4(Output.of(addressIpv4));
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(@Nullable Output<String> deleteMode) {
            $.deleteMode = deleteMode;
            return this;
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(String deleteMode) {
            return deleteMode(Output.of(deleteMode));
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
         * @param key The UNENCRYPTED (cleartext) server key
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The UNENCRYPTED (cleartext) server key
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Name for the tacacs server configuration
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for the tacacs server configuration
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param timeout Time to wait for this TACACS server to reply (overrides default) - Range: `1`-`1000`
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Time to wait for this TACACS server to reply (overrides default) - Range: `1`-`1000`
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public TacacsServerState build() {
            return $;
        }
    }

}
