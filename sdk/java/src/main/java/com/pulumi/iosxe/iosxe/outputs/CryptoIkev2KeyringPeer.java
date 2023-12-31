// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CryptoIkev2KeyringPeer {
    /**
     * @return Specify a description of this peer
     * 
     */
    private @Nullable String description;
    /**
     * @return Hostname of peer
     * 
     */
    private @Nullable String hostname;
    /**
     * @return IP address
     * 
     */
    private @Nullable String identityAddress;
    /**
     * @return email Domain Name
     * 
     */
    private @Nullable String identityEmailDomain;
    /**
     * @return Specify the name string
     * 
     */
    private @Nullable String identityEmailName;
    /**
     * @return email Domain Name
     * 
     */
    private @Nullable String identityFqdnDomain;
    /**
     * @return Specify the name string
     * 
     */
    private @Nullable String identityFqdnName;
    /**
     * @return proprietary types of identification (ID KEY ID)
     * 
     */
    private @Nullable String identityKeyId;
    private @Nullable String ipv4Address;
    private @Nullable String ipv4Mask;
    private @Nullable String ipv6Prefix;
    private String name;
    private @Nullable String preSharedKey;
    /**
     * @return - Choices: `0`, `6`
     * 
     */
    private @Nullable String preSharedKeyEncryption;
    private @Nullable String preSharedKeyLocal;
    /**
     * @return - Choices: `0`, `6`
     * 
     */
    private @Nullable String preSharedKeyLocalEncryption;
    private @Nullable String preSharedKeyRemote;
    /**
     * @return - Choices: `0`, `6`
     * 
     */
    private @Nullable String preSharedKeyRemoteEncryption;

    private CryptoIkev2KeyringPeer() {}
    /**
     * @return Specify a description of this peer
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Hostname of peer
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return IP address
     * 
     */
    public Optional<String> identityAddress() {
        return Optional.ofNullable(this.identityAddress);
    }
    /**
     * @return email Domain Name
     * 
     */
    public Optional<String> identityEmailDomain() {
        return Optional.ofNullable(this.identityEmailDomain);
    }
    /**
     * @return Specify the name string
     * 
     */
    public Optional<String> identityEmailName() {
        return Optional.ofNullable(this.identityEmailName);
    }
    /**
     * @return email Domain Name
     * 
     */
    public Optional<String> identityFqdnDomain() {
        return Optional.ofNullable(this.identityFqdnDomain);
    }
    /**
     * @return Specify the name string
     * 
     */
    public Optional<String> identityFqdnName() {
        return Optional.ofNullable(this.identityFqdnName);
    }
    /**
     * @return proprietary types of identification (ID KEY ID)
     * 
     */
    public Optional<String> identityKeyId() {
        return Optional.ofNullable(this.identityKeyId);
    }
    public Optional<String> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }
    public Optional<String> ipv4Mask() {
        return Optional.ofNullable(this.ipv4Mask);
    }
    public Optional<String> ipv6Prefix() {
        return Optional.ofNullable(this.ipv6Prefix);
    }
    public String name() {
        return this.name;
    }
    public Optional<String> preSharedKey() {
        return Optional.ofNullable(this.preSharedKey);
    }
    /**
     * @return - Choices: `0`, `6`
     * 
     */
    public Optional<String> preSharedKeyEncryption() {
        return Optional.ofNullable(this.preSharedKeyEncryption);
    }
    public Optional<String> preSharedKeyLocal() {
        return Optional.ofNullable(this.preSharedKeyLocal);
    }
    /**
     * @return - Choices: `0`, `6`
     * 
     */
    public Optional<String> preSharedKeyLocalEncryption() {
        return Optional.ofNullable(this.preSharedKeyLocalEncryption);
    }
    public Optional<String> preSharedKeyRemote() {
        return Optional.ofNullable(this.preSharedKeyRemote);
    }
    /**
     * @return - Choices: `0`, `6`
     * 
     */
    public Optional<String> preSharedKeyRemoteEncryption() {
        return Optional.ofNullable(this.preSharedKeyRemoteEncryption);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoIkev2KeyringPeer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String hostname;
        private @Nullable String identityAddress;
        private @Nullable String identityEmailDomain;
        private @Nullable String identityEmailName;
        private @Nullable String identityFqdnDomain;
        private @Nullable String identityFqdnName;
        private @Nullable String identityKeyId;
        private @Nullable String ipv4Address;
        private @Nullable String ipv4Mask;
        private @Nullable String ipv6Prefix;
        private String name;
        private @Nullable String preSharedKey;
        private @Nullable String preSharedKeyEncryption;
        private @Nullable String preSharedKeyLocal;
        private @Nullable String preSharedKeyLocalEncryption;
        private @Nullable String preSharedKeyRemote;
        private @Nullable String preSharedKeyRemoteEncryption;
        public Builder() {}
        public Builder(CryptoIkev2KeyringPeer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hostname = defaults.hostname;
    	      this.identityAddress = defaults.identityAddress;
    	      this.identityEmailDomain = defaults.identityEmailDomain;
    	      this.identityEmailName = defaults.identityEmailName;
    	      this.identityFqdnDomain = defaults.identityFqdnDomain;
    	      this.identityFqdnName = defaults.identityFqdnName;
    	      this.identityKeyId = defaults.identityKeyId;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv4Mask = defaults.ipv4Mask;
    	      this.ipv6Prefix = defaults.ipv6Prefix;
    	      this.name = defaults.name;
    	      this.preSharedKey = defaults.preSharedKey;
    	      this.preSharedKeyEncryption = defaults.preSharedKeyEncryption;
    	      this.preSharedKeyLocal = defaults.preSharedKeyLocal;
    	      this.preSharedKeyLocalEncryption = defaults.preSharedKeyLocalEncryption;
    	      this.preSharedKeyRemote = defaults.preSharedKeyRemote;
    	      this.preSharedKeyRemoteEncryption = defaults.preSharedKeyRemoteEncryption;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder identityAddress(@Nullable String identityAddress) {
            this.identityAddress = identityAddress;
            return this;
        }
        @CustomType.Setter
        public Builder identityEmailDomain(@Nullable String identityEmailDomain) {
            this.identityEmailDomain = identityEmailDomain;
            return this;
        }
        @CustomType.Setter
        public Builder identityEmailName(@Nullable String identityEmailName) {
            this.identityEmailName = identityEmailName;
            return this;
        }
        @CustomType.Setter
        public Builder identityFqdnDomain(@Nullable String identityFqdnDomain) {
            this.identityFqdnDomain = identityFqdnDomain;
            return this;
        }
        @CustomType.Setter
        public Builder identityFqdnName(@Nullable String identityFqdnName) {
            this.identityFqdnName = identityFqdnName;
            return this;
        }
        @CustomType.Setter
        public Builder identityKeyId(@Nullable String identityKeyId) {
            this.identityKeyId = identityKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Mask(@Nullable String ipv4Mask) {
            this.ipv4Mask = ipv4Mask;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Prefix(@Nullable String ipv6Prefix) {
            this.ipv6Prefix = ipv6Prefix;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKey(@Nullable String preSharedKey) {
            this.preSharedKey = preSharedKey;
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyEncryption(@Nullable String preSharedKeyEncryption) {
            this.preSharedKeyEncryption = preSharedKeyEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyLocal(@Nullable String preSharedKeyLocal) {
            this.preSharedKeyLocal = preSharedKeyLocal;
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyLocalEncryption(@Nullable String preSharedKeyLocalEncryption) {
            this.preSharedKeyLocalEncryption = preSharedKeyLocalEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyRemote(@Nullable String preSharedKeyRemote) {
            this.preSharedKeyRemote = preSharedKeyRemote;
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyRemoteEncryption(@Nullable String preSharedKeyRemoteEncryption) {
            this.preSharedKeyRemoteEncryption = preSharedKeyRemoteEncryption;
            return this;
        }
        public CryptoIkev2KeyringPeer build() {
            final var o = new CryptoIkev2KeyringPeer();
            o.description = description;
            o.hostname = hostname;
            o.identityAddress = identityAddress;
            o.identityEmailDomain = identityEmailDomain;
            o.identityEmailName = identityEmailName;
            o.identityFqdnDomain = identityFqdnDomain;
            o.identityFqdnName = identityFqdnName;
            o.identityKeyId = identityKeyId;
            o.ipv4Address = ipv4Address;
            o.ipv4Mask = ipv4Mask;
            o.ipv6Prefix = ipv6Prefix;
            o.name = name;
            o.preSharedKey = preSharedKey;
            o.preSharedKeyEncryption = preSharedKeyEncryption;
            o.preSharedKeyLocal = preSharedKeyLocal;
            o.preSharedKeyLocalEncryption = preSharedKeyLocalEncryption;
            o.preSharedKeyRemote = preSharedKeyRemote;
            o.preSharedKeyRemoteEncryption = preSharedKeyRemoteEncryption;
            return o;
        }
    }
}
