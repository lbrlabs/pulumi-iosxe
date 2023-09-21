// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetPimRpAddress;
import com.pulumi.iosxe.iosxe.outputs.GetPimRpCandidate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPimResult {
    /**
     * @return Configure AutoRP global operations
     * 
     */
    private Boolean autorp;
    /**
     * @return Allow AutoRP packets across sparse mode interface
     * 
     */
    private Boolean autorpListener;
    /**
     * @return BSR RP candidate filter
     * 
     */
    private String bsrCandidateAcceptRpCandidate;
    /**
     * @return Loopback interface
     * 
     */
    private Integer bsrCandidateLoopback;
    /**
     * @return Hash Mask length for RP selection
     * 
     */
    private Integer bsrCandidateMask;
    /**
     * @return Priority value for candidate bootstrap router
     * 
     */
    private Integer bsrCandidatePriority;
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    /**
     * @return IP address of Rendezvous-point for group
     * 
     */
    private String rpAddress;
    /**
     * @return Group range treated in bidirectional shared-tree mode
     * 
     */
    private Boolean rpAddressBidir;
    /**
     * @return Overrides dynamically learnt RP mappings
     * 
     */
    private Boolean rpAddressOverride;
    /**
     * @return PIM RP-address (Rendezvous Point)
     * 
     */
    private List<GetPimRpAddress> rpAddresses;
    /**
     * @return To be a PIM version 2 RP candidate
     * 
     */
    private List<GetPimRpCandidate> rpCandidates;
    /**
     * @return Use 232/8 group range for SSM
     * 
     */
    private Boolean ssmDefault;
    /**
     * @return ACL for group range to be used for SSM
     * 
     */
    private String ssmRange;

    private GetPimResult() {}
    /**
     * @return Configure AutoRP global operations
     * 
     */
    public Boolean autorp() {
        return this.autorp;
    }
    /**
     * @return Allow AutoRP packets across sparse mode interface
     * 
     */
    public Boolean autorpListener() {
        return this.autorpListener;
    }
    /**
     * @return BSR RP candidate filter
     * 
     */
    public String bsrCandidateAcceptRpCandidate() {
        return this.bsrCandidateAcceptRpCandidate;
    }
    /**
     * @return Loopback interface
     * 
     */
    public Integer bsrCandidateLoopback() {
        return this.bsrCandidateLoopback;
    }
    /**
     * @return Hash Mask length for RP selection
     * 
     */
    public Integer bsrCandidateMask() {
        return this.bsrCandidateMask;
    }
    /**
     * @return Priority value for candidate bootstrap router
     * 
     */
    public Integer bsrCandidatePriority() {
        return this.bsrCandidatePriority;
    }
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IP address of Rendezvous-point for group
     * 
     */
    public String rpAddress() {
        return this.rpAddress;
    }
    /**
     * @return Group range treated in bidirectional shared-tree mode
     * 
     */
    public Boolean rpAddressBidir() {
        return this.rpAddressBidir;
    }
    /**
     * @return Overrides dynamically learnt RP mappings
     * 
     */
    public Boolean rpAddressOverride() {
        return this.rpAddressOverride;
    }
    /**
     * @return PIM RP-address (Rendezvous Point)
     * 
     */
    public List<GetPimRpAddress> rpAddresses() {
        return this.rpAddresses;
    }
    /**
     * @return To be a PIM version 2 RP candidate
     * 
     */
    public List<GetPimRpCandidate> rpCandidates() {
        return this.rpCandidates;
    }
    /**
     * @return Use 232/8 group range for SSM
     * 
     */
    public Boolean ssmDefault() {
        return this.ssmDefault;
    }
    /**
     * @return ACL for group range to be used for SSM
     * 
     */
    public String ssmRange() {
        return this.ssmRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPimResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autorp;
        private Boolean autorpListener;
        private String bsrCandidateAcceptRpCandidate;
        private Integer bsrCandidateLoopback;
        private Integer bsrCandidateMask;
        private Integer bsrCandidatePriority;
        private @Nullable String device;
        private String id;
        private String rpAddress;
        private Boolean rpAddressBidir;
        private Boolean rpAddressOverride;
        private List<GetPimRpAddress> rpAddresses;
        private List<GetPimRpCandidate> rpCandidates;
        private Boolean ssmDefault;
        private String ssmRange;
        public Builder() {}
        public Builder(GetPimResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autorp = defaults.autorp;
    	      this.autorpListener = defaults.autorpListener;
    	      this.bsrCandidateAcceptRpCandidate = defaults.bsrCandidateAcceptRpCandidate;
    	      this.bsrCandidateLoopback = defaults.bsrCandidateLoopback;
    	      this.bsrCandidateMask = defaults.bsrCandidateMask;
    	      this.bsrCandidatePriority = defaults.bsrCandidatePriority;
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.rpAddress = defaults.rpAddress;
    	      this.rpAddressBidir = defaults.rpAddressBidir;
    	      this.rpAddressOverride = defaults.rpAddressOverride;
    	      this.rpAddresses = defaults.rpAddresses;
    	      this.rpCandidates = defaults.rpCandidates;
    	      this.ssmDefault = defaults.ssmDefault;
    	      this.ssmRange = defaults.ssmRange;
        }

        @CustomType.Setter
        public Builder autorp(Boolean autorp) {
            this.autorp = Objects.requireNonNull(autorp);
            return this;
        }
        @CustomType.Setter
        public Builder autorpListener(Boolean autorpListener) {
            this.autorpListener = Objects.requireNonNull(autorpListener);
            return this;
        }
        @CustomType.Setter
        public Builder bsrCandidateAcceptRpCandidate(String bsrCandidateAcceptRpCandidate) {
            this.bsrCandidateAcceptRpCandidate = Objects.requireNonNull(bsrCandidateAcceptRpCandidate);
            return this;
        }
        @CustomType.Setter
        public Builder bsrCandidateLoopback(Integer bsrCandidateLoopback) {
            this.bsrCandidateLoopback = Objects.requireNonNull(bsrCandidateLoopback);
            return this;
        }
        @CustomType.Setter
        public Builder bsrCandidateMask(Integer bsrCandidateMask) {
            this.bsrCandidateMask = Objects.requireNonNull(bsrCandidateMask);
            return this;
        }
        @CustomType.Setter
        public Builder bsrCandidatePriority(Integer bsrCandidatePriority) {
            this.bsrCandidatePriority = Objects.requireNonNull(bsrCandidatePriority);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder rpAddress(String rpAddress) {
            this.rpAddress = Objects.requireNonNull(rpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder rpAddressBidir(Boolean rpAddressBidir) {
            this.rpAddressBidir = Objects.requireNonNull(rpAddressBidir);
            return this;
        }
        @CustomType.Setter
        public Builder rpAddressOverride(Boolean rpAddressOverride) {
            this.rpAddressOverride = Objects.requireNonNull(rpAddressOverride);
            return this;
        }
        @CustomType.Setter
        public Builder rpAddresses(List<GetPimRpAddress> rpAddresses) {
            this.rpAddresses = Objects.requireNonNull(rpAddresses);
            return this;
        }
        public Builder rpAddresses(GetPimRpAddress... rpAddresses) {
            return rpAddresses(List.of(rpAddresses));
        }
        @CustomType.Setter
        public Builder rpCandidates(List<GetPimRpCandidate> rpCandidates) {
            this.rpCandidates = Objects.requireNonNull(rpCandidates);
            return this;
        }
        public Builder rpCandidates(GetPimRpCandidate... rpCandidates) {
            return rpCandidates(List.of(rpCandidates));
        }
        @CustomType.Setter
        public Builder ssmDefault(Boolean ssmDefault) {
            this.ssmDefault = Objects.requireNonNull(ssmDefault);
            return this;
        }
        @CustomType.Setter
        public Builder ssmRange(String ssmRange) {
            this.ssmRange = Objects.requireNonNull(ssmRange);
            return this;
        }
        public GetPimResult build() {
            final var o = new GetPimResult();
            o.autorp = autorp;
            o.autorpListener = autorpListener;
            o.bsrCandidateAcceptRpCandidate = bsrCandidateAcceptRpCandidate;
            o.bsrCandidateLoopback = bsrCandidateLoopback;
            o.bsrCandidateMask = bsrCandidateMask;
            o.bsrCandidatePriority = bsrCandidatePriority;
            o.device = device;
            o.id = id;
            o.rpAddress = rpAddress;
            o.rpAddressBidir = rpAddressBidir;
            o.rpAddressOverride = rpAddressOverride;
            o.rpAddresses = rpAddresses;
            o.rpCandidates = rpCandidates;
            o.ssmDefault = ssmDefault;
            o.ssmRange = ssmRange;
            return o;
        }
    }
}
