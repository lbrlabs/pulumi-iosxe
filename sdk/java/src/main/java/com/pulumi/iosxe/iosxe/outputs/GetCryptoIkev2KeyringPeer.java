// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCryptoIkev2KeyringPeer {
    /**
     * @return Specify a description of this peer
     * 
     */
    private String description;
    /**
     * @return Hostname of peer
     * 
     */
    private String hostname;
    /**
     * @return IP address
     * 
     */
    private String identityAddress;
    /**
     * @return email Domain Name
     * 
     */
    private String identityEmailDomain;
    /**
     * @return Specify the name string
     * 
     */
    private String identityEmailName;
    /**
     * @return email Domain Name
     * 
     */
    private String identityFqdnDomain;
    /**
     * @return Specify the name string
     * 
     */
    private String identityFqdnName;
    /**
     * @return proprietary types of identification (ID KEY ID)
     * 
     */
    private String identityKeyId;
    private String ipv4Address;
    private String ipv4Mask;
    private String ipv6Prefix;
    private String name;
    private String preSharedKey;
    private String preSharedKeyEncryption;
    private String preSharedKeyLocal;
    private String preSharedKeyLocalEncryption;
    private String preSharedKeyRemote;
    private String preSharedKeyRemoteEncryption;

    private GetCryptoIkev2KeyringPeer() {}
    /**
     * @return Specify a description of this peer
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Hostname of peer
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return IP address
     * 
     */
    public String identityAddress() {
        return this.identityAddress;
    }
    /**
     * @return email Domain Name
     * 
     */
    public String identityEmailDomain() {
        return this.identityEmailDomain;
    }
    /**
     * @return Specify the name string
     * 
     */
    public String identityEmailName() {
        return this.identityEmailName;
    }
    /**
     * @return email Domain Name
     * 
     */
    public String identityFqdnDomain() {
        return this.identityFqdnDomain;
    }
    /**
     * @return Specify the name string
     * 
     */
    public String identityFqdnName() {
        return this.identityFqdnName;
    }
    /**
     * @return proprietary types of identification (ID KEY ID)
     * 
     */
    public String identityKeyId() {
        return this.identityKeyId;
    }
    public String ipv4Address() {
        return this.ipv4Address;
    }
    public String ipv4Mask() {
        return this.ipv4Mask;
    }
    public String ipv6Prefix() {
        return this.ipv6Prefix;
    }
    public String name() {
        return this.name;
    }
    public String preSharedKey() {
        return this.preSharedKey;
    }
    public String preSharedKeyEncryption() {
        return this.preSharedKeyEncryption;
    }
    public String preSharedKeyLocal() {
        return this.preSharedKeyLocal;
    }
    public String preSharedKeyLocalEncryption() {
        return this.preSharedKeyLocalEncryption;
    }
    public String preSharedKeyRemote() {
        return this.preSharedKeyRemote;
    }
    public String preSharedKeyRemoteEncryption() {
        return this.preSharedKeyRemoteEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCryptoIkev2KeyringPeer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String hostname;
        private String identityAddress;
        private String identityEmailDomain;
        private String identityEmailName;
        private String identityFqdnDomain;
        private String identityFqdnName;
        private String identityKeyId;
        private String ipv4Address;
        private String ipv4Mask;
        private String ipv6Prefix;
        private String name;
        private String preSharedKey;
        private String preSharedKeyEncryption;
        private String preSharedKeyLocal;
        private String preSharedKeyLocalEncryption;
        private String preSharedKeyRemote;
        private String preSharedKeyRemoteEncryption;
        public Builder() {}
        public Builder(GetCryptoIkev2KeyringPeer defaults) {
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
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder identityAddress(String identityAddress) {
            this.identityAddress = Objects.requireNonNull(identityAddress);
            return this;
        }
        @CustomType.Setter
        public Builder identityEmailDomain(String identityEmailDomain) {
            this.identityEmailDomain = Objects.requireNonNull(identityEmailDomain);
            return this;
        }
        @CustomType.Setter
        public Builder identityEmailName(String identityEmailName) {
            this.identityEmailName = Objects.requireNonNull(identityEmailName);
            return this;
        }
        @CustomType.Setter
        public Builder identityFqdnDomain(String identityFqdnDomain) {
            this.identityFqdnDomain = Objects.requireNonNull(identityFqdnDomain);
            return this;
        }
        @CustomType.Setter
        public Builder identityFqdnName(String identityFqdnName) {
            this.identityFqdnName = Objects.requireNonNull(identityFqdnName);
            return this;
        }
        @CustomType.Setter
        public Builder identityKeyId(String identityKeyId) {
            this.identityKeyId = Objects.requireNonNull(identityKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Mask(String ipv4Mask) {
            this.ipv4Mask = Objects.requireNonNull(ipv4Mask);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Prefix(String ipv6Prefix) {
            this.ipv6Prefix = Objects.requireNonNull(ipv6Prefix);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKey(String preSharedKey) {
            this.preSharedKey = Objects.requireNonNull(preSharedKey);
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyEncryption(String preSharedKeyEncryption) {
            this.preSharedKeyEncryption = Objects.requireNonNull(preSharedKeyEncryption);
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyLocal(String preSharedKeyLocal) {
            this.preSharedKeyLocal = Objects.requireNonNull(preSharedKeyLocal);
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyLocalEncryption(String preSharedKeyLocalEncryption) {
            this.preSharedKeyLocalEncryption = Objects.requireNonNull(preSharedKeyLocalEncryption);
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyRemote(String preSharedKeyRemote) {
            this.preSharedKeyRemote = Objects.requireNonNull(preSharedKeyRemote);
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKeyRemoteEncryption(String preSharedKeyRemoteEncryption) {
            this.preSharedKeyRemoteEncryption = Objects.requireNonNull(preSharedKeyRemoteEncryption);
            return this;
        }
        public GetCryptoIkev2KeyringPeer build() {
            final var o = new GetCryptoIkev2KeyringPeer();
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
