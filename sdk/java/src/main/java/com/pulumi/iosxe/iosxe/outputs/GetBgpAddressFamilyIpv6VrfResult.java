// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetBgpAddressFamilyIpv6VrfVrf;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBgpAddressFamilyIpv6VrfResult {
    private String afName;
    private String asn;
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
    private List<GetBgpAddressFamilyIpv6VrfVrf> vrfs;

    private GetBgpAddressFamilyIpv6VrfResult() {}
    public String afName() {
        return this.afName;
    }
    public String asn() {
        return this.asn;
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
    public List<GetBgpAddressFamilyIpv6VrfVrf> vrfs() {
        return this.vrfs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBgpAddressFamilyIpv6VrfResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String afName;
        private String asn;
        private @Nullable String device;
        private String id;
        private List<GetBgpAddressFamilyIpv6VrfVrf> vrfs;
        public Builder() {}
        public Builder(GetBgpAddressFamilyIpv6VrfResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.afName = defaults.afName;
    	      this.asn = defaults.asn;
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.vrfs = defaults.vrfs;
        }

        @CustomType.Setter
        public Builder afName(String afName) {
            this.afName = Objects.requireNonNull(afName);
            return this;
        }
        @CustomType.Setter
        public Builder asn(String asn) {
            this.asn = Objects.requireNonNull(asn);
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
        public Builder vrfs(List<GetBgpAddressFamilyIpv6VrfVrf> vrfs) {
            this.vrfs = Objects.requireNonNull(vrfs);
            return this;
        }
        public Builder vrfs(GetBgpAddressFamilyIpv6VrfVrf... vrfs) {
            return vrfs(List.of(vrfs));
        }
        public GetBgpAddressFamilyIpv6VrfResult build() {
            final var o = new GetBgpAddressFamilyIpv6VrfResult();
            o.afName = afName;
            o.asn = asn;
            o.device = device;
            o.id = id;
            o.vrfs = vrfs;
            return o;
        }
    }
}
