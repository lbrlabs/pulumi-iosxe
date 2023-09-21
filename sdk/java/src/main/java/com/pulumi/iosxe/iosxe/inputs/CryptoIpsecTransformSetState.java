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


public final class CryptoIpsecTransformSetState extends com.pulumi.resources.ResourceArgs {

    public static final CryptoIpsecTransformSetState Empty = new CryptoIpsecTransformSetState();

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
     * - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
     * 
     */
    @Import(name="esp")
    private @Nullable Output<String> esp;

    /**
     * @return - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
     * 
     */
    public Optional<Output<String>> esp() {
        return Optional.ofNullable(this.esp);
    }

    /**
     * - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
     * 
     */
    @Import(name="espHmac")
    private @Nullable Output<String> espHmac;

    /**
     * @return - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
     * 
     */
    public Optional<Output<String>> espHmac() {
        return Optional.ofNullable(this.espHmac);
    }

    /**
     * tunnel (datagram encapsulation) mode
     * 
     */
    @Import(name="modeTunnel")
    private @Nullable Output<Boolean> modeTunnel;

    /**
     * @return tunnel (datagram encapsulation) mode
     * 
     */
    public Optional<Output<Boolean>> modeTunnel() {
        return Optional.ofNullable(this.modeTunnel);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private CryptoIpsecTransformSetState() {}

    private CryptoIpsecTransformSetState(CryptoIpsecTransformSetState $) {
        this.device = $.device;
        this.esp = $.esp;
        this.espHmac = $.espHmac;
        this.modeTunnel = $.modeTunnel;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoIpsecTransformSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoIpsecTransformSetState $;

        public Builder() {
            $ = new CryptoIpsecTransformSetState();
        }

        public Builder(CryptoIpsecTransformSetState defaults) {
            $ = new CryptoIpsecTransformSetState(Objects.requireNonNull(defaults));
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
         * @param esp - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
         * 
         * @return builder
         * 
         */
        public Builder esp(@Nullable Output<String> esp) {
            $.esp = esp;
            return this;
        }

        /**
         * @param esp - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
         * 
         * @return builder
         * 
         */
        public Builder esp(String esp) {
            return esp(Output.of(esp));
        }

        /**
         * @param espHmac - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
         * 
         * @return builder
         * 
         */
        public Builder espHmac(@Nullable Output<String> espHmac) {
            $.espHmac = espHmac;
            return this;
        }

        /**
         * @param espHmac - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
         * 
         * @return builder
         * 
         */
        public Builder espHmac(String espHmac) {
            return espHmac(Output.of(espHmac));
        }

        /**
         * @param modeTunnel tunnel (datagram encapsulation) mode
         * 
         * @return builder
         * 
         */
        public Builder modeTunnel(@Nullable Output<Boolean> modeTunnel) {
            $.modeTunnel = modeTunnel;
            return this;
        }

        /**
         * @param modeTunnel tunnel (datagram encapsulation) mode
         * 
         * @return builder
         * 
         */
        public Builder modeTunnel(Boolean modeTunnel) {
            return modeTunnel(Output.of(modeTunnel));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CryptoIpsecTransformSetState build() {
            return $;
        }
    }

}