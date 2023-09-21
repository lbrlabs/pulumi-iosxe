// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInterfacePimResult {
    /**
     * @return Configure BFD
     * 
     */
    private Boolean bfd;
    /**
     * @return Border of PIM domain
     * 
     */
    private Boolean border;
    /**
     * @return Border of PIM domain
     * 
     */
    private Boolean bsrBorder;
    /**
     * @return Enable PIM dense-mode operation
     * 
     */
    private Boolean denseMode;
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return PIM router DR priority
     * 
     */
    private Integer drPriority;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    private String name;
    /**
     * @return Enable PIM passive interface operation
     * 
     */
    private Boolean passive;
    /**
     * @return Enable PIM sparse-dense-mode operation
     * 
     */
    private Boolean sparseDenseMode;
    /**
     * @return Enable PIM sparse-mode operation
     * 
     */
    private Boolean sparseMode;
    /**
     * @return Interface type
     * 
     */
    private String type;

    private GetInterfacePimResult() {}
    /**
     * @return Configure BFD
     * 
     */
    public Boolean bfd() {
        return this.bfd;
    }
    /**
     * @return Border of PIM domain
     * 
     */
    public Boolean border() {
        return this.border;
    }
    /**
     * @return Border of PIM domain
     * 
     */
    public Boolean bsrBorder() {
        return this.bsrBorder;
    }
    /**
     * @return Enable PIM dense-mode operation
     * 
     */
    public Boolean denseMode() {
        return this.denseMode;
    }
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return PIM router DR priority
     * 
     */
    public Integer drPriority() {
        return this.drPriority;
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Enable PIM passive interface operation
     * 
     */
    public Boolean passive() {
        return this.passive;
    }
    /**
     * @return Enable PIM sparse-dense-mode operation
     * 
     */
    public Boolean sparseDenseMode() {
        return this.sparseDenseMode;
    }
    /**
     * @return Enable PIM sparse-mode operation
     * 
     */
    public Boolean sparseMode() {
        return this.sparseMode;
    }
    /**
     * @return Interface type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfacePimResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean bfd;
        private Boolean border;
        private Boolean bsrBorder;
        private Boolean denseMode;
        private @Nullable String device;
        private Integer drPriority;
        private String id;
        private String name;
        private Boolean passive;
        private Boolean sparseDenseMode;
        private Boolean sparseMode;
        private String type;
        public Builder() {}
        public Builder(GetInterfacePimResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bfd = defaults.bfd;
    	      this.border = defaults.border;
    	      this.bsrBorder = defaults.bsrBorder;
    	      this.denseMode = defaults.denseMode;
    	      this.device = defaults.device;
    	      this.drPriority = defaults.drPriority;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.passive = defaults.passive;
    	      this.sparseDenseMode = defaults.sparseDenseMode;
    	      this.sparseMode = defaults.sparseMode;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder bfd(Boolean bfd) {
            this.bfd = Objects.requireNonNull(bfd);
            return this;
        }
        @CustomType.Setter
        public Builder border(Boolean border) {
            this.border = Objects.requireNonNull(border);
            return this;
        }
        @CustomType.Setter
        public Builder bsrBorder(Boolean bsrBorder) {
            this.bsrBorder = Objects.requireNonNull(bsrBorder);
            return this;
        }
        @CustomType.Setter
        public Builder denseMode(Boolean denseMode) {
            this.denseMode = Objects.requireNonNull(denseMode);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder drPriority(Integer drPriority) {
            this.drPriority = Objects.requireNonNull(drPriority);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder passive(Boolean passive) {
            this.passive = Objects.requireNonNull(passive);
            return this;
        }
        @CustomType.Setter
        public Builder sparseDenseMode(Boolean sparseDenseMode) {
            this.sparseDenseMode = Objects.requireNonNull(sparseDenseMode);
            return this;
        }
        @CustomType.Setter
        public Builder sparseMode(Boolean sparseMode) {
            this.sparseMode = Objects.requireNonNull(sparseMode);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInterfacePimResult build() {
            final var o = new GetInterfacePimResult();
            o.bfd = bfd;
            o.border = border;
            o.bsrBorder = bsrBorder;
            o.denseMode = denseMode;
            o.device = device;
            o.drPriority = drPriority;
            o.id = id;
            o.name = name;
            o.passive = passive;
            o.sparseDenseMode = sparseDenseMode;
            o.sparseMode = sparseMode;
            o.type = type;
            return o;
        }
    }
}
