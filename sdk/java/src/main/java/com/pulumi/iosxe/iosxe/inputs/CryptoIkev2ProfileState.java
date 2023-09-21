// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoIkev2ProfileState extends com.pulumi.resources.ResourceArgs {

    public static final CryptoIkev2ProfileState Empty = new CryptoIkev2ProfileState();

    /**
     * Pre-Shared Key
     * 
     */
    @Import(name="authenticationLocalPreShare")
    private @Nullable Output<Boolean> authenticationLocalPreShare;

    /**
     * @return Pre-Shared Key
     * 
     */
    public Optional<Output<Boolean>> authenticationLocalPreShare() {
        return Optional.ofNullable(this.authenticationLocalPreShare);
    }

    /**
     * Pre-Shared Key
     * 
     */
    @Import(name="authenticationRemotePreShare")
    private @Nullable Output<Boolean> authenticationRemotePreShare;

    /**
     * @return Pre-Shared Key
     * 
     */
    public Optional<Output<Boolean>> authenticationRemotePreShare() {
        return Optional.ofNullable(this.authenticationRemotePreShare);
    }

    /**
     * enable config-exchange request
     * 
     */
    @Import(name="configExchangeRequest")
    private @Nullable Output<Boolean> configExchangeRequest;

    /**
     * @return enable config-exchange request
     * 
     */
    public Optional<Output<Boolean>> configExchangeRequest() {
        return Optional.ofNullable(this.configExchangeRequest);
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
     * Specify a description of this profile
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specify a description of this profile
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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
     * - Range: `10`-`3600`
     * 
     */
    @Import(name="dpdInterval")
    private @Nullable Output<Integer> dpdInterval;

    /**
     * @return - Range: `10`-`3600`
     * 
     */
    public Optional<Output<Integer>> dpdInterval() {
        return Optional.ofNullable(this.dpdInterval);
    }

    /**
     * - Choices: `on-demand`, `periodic`
     * 
     */
    @Import(name="dpdQuery")
    private @Nullable Output<String> dpdQuery;

    /**
     * @return - Choices: `on-demand`, `periodic`
     * 
     */
    public Optional<Output<String>> dpdQuery() {
        return Optional.ofNullable(this.dpdQuery);
    }

    /**
     * - Range: `2`-`60`
     * 
     */
    @Import(name="dpdRetry")
    private @Nullable Output<Integer> dpdRetry;

    /**
     * @return - Range: `2`-`60`
     * 
     */
    public Optional<Output<Integer>> dpdRetry() {
        return Optional.ofNullable(this.dpdRetry);
    }

    /**
     * address
     * 
     */
    @Import(name="identityLocalAddress")
    private @Nullable Output<String> identityLocalAddress;

    /**
     * @return address
     * 
     */
    public Optional<Output<String>> identityLocalAddress() {
        return Optional.ofNullable(this.identityLocalAddress);
    }

    /**
     * key-id opaque string - proprietary types of identification key-id string
     * 
     */
    @Import(name="identityLocalKeyId")
    private @Nullable Output<String> identityLocalKeyId;

    /**
     * @return key-id opaque string - proprietary types of identification key-id string
     * 
     */
    public Optional<Output<String>> identityLocalKeyId() {
        return Optional.ofNullable(this.identityLocalKeyId);
    }

    /**
     * Keyring name
     * 
     */
    @Import(name="keyringLocal")
    private @Nullable Output<String> keyringLocal;

    /**
     * @return Keyring name
     * 
     */
    public Optional<Output<String>> keyringLocal() {
        return Optional.ofNullable(this.keyringLocal);
    }

    @Import(name="matchAddressLocalIp")
    private @Nullable Output<String> matchAddressLocalIp;

    public Optional<Output<String>> matchAddressLocalIp() {
        return Optional.ofNullable(this.matchAddressLocalIp);
    }

    @Import(name="matchFvrf")
    private @Nullable Output<String> matchFvrf;

    public Optional<Output<String>> matchFvrf() {
        return Optional.ofNullable(this.matchFvrf);
    }

    /**
     * Any fvrf
     * 
     */
    @Import(name="matchFvrfAny")
    private @Nullable Output<Boolean> matchFvrfAny;

    /**
     * @return Any fvrf
     * 
     */
    public Optional<Output<Boolean>> matchFvrfAny() {
        return Optional.ofNullable(this.matchFvrfAny);
    }

    @Import(name="matchIdentityRemoteIpv4Addresses")
    private @Nullable Output<List<CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs>> matchIdentityRemoteIpv4Addresses;

    public Optional<Output<List<CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs>>> matchIdentityRemoteIpv4Addresses() {
        return Optional.ofNullable(this.matchIdentityRemoteIpv4Addresses);
    }

    @Import(name="matchIdentityRemoteIpv6Prefixes")
    private @Nullable Output<List<String>> matchIdentityRemoteIpv6Prefixes;

    public Optional<Output<List<String>>> matchIdentityRemoteIpv6Prefixes() {
        return Optional.ofNullable(this.matchIdentityRemoteIpv6Prefixes);
    }

    /**
     * key-id opaque string
     * 
     */
    @Import(name="matchIdentityRemoteKeys")
    private @Nullable Output<List<String>> matchIdentityRemoteKeys;

    /**
     * @return key-id opaque string
     * 
     */
    public Optional<Output<List<String>>> matchIdentityRemoteKeys() {
        return Optional.ofNullable(this.matchIdentityRemoteKeys);
    }

    /**
     * Match the profile for incoming connections only
     * 
     */
    @Import(name="matchInboundOnly")
    private @Nullable Output<Boolean> matchInboundOnly;

    /**
     * @return Match the profile for incoming connections only
     * 
     */
    public Optional<Output<Boolean>> matchInboundOnly() {
        return Optional.ofNullable(this.matchInboundOnly);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private CryptoIkev2ProfileState() {}

    private CryptoIkev2ProfileState(CryptoIkev2ProfileState $) {
        this.authenticationLocalPreShare = $.authenticationLocalPreShare;
        this.authenticationRemotePreShare = $.authenticationRemotePreShare;
        this.configExchangeRequest = $.configExchangeRequest;
        this.deleteMode = $.deleteMode;
        this.description = $.description;
        this.device = $.device;
        this.dpdInterval = $.dpdInterval;
        this.dpdQuery = $.dpdQuery;
        this.dpdRetry = $.dpdRetry;
        this.identityLocalAddress = $.identityLocalAddress;
        this.identityLocalKeyId = $.identityLocalKeyId;
        this.keyringLocal = $.keyringLocal;
        this.matchAddressLocalIp = $.matchAddressLocalIp;
        this.matchFvrf = $.matchFvrf;
        this.matchFvrfAny = $.matchFvrfAny;
        this.matchIdentityRemoteIpv4Addresses = $.matchIdentityRemoteIpv4Addresses;
        this.matchIdentityRemoteIpv6Prefixes = $.matchIdentityRemoteIpv6Prefixes;
        this.matchIdentityRemoteKeys = $.matchIdentityRemoteKeys;
        this.matchInboundOnly = $.matchInboundOnly;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoIkev2ProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoIkev2ProfileState $;

        public Builder() {
            $ = new CryptoIkev2ProfileState();
        }

        public Builder(CryptoIkev2ProfileState defaults) {
            $ = new CryptoIkev2ProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationLocalPreShare Pre-Shared Key
         * 
         * @return builder
         * 
         */
        public Builder authenticationLocalPreShare(@Nullable Output<Boolean> authenticationLocalPreShare) {
            $.authenticationLocalPreShare = authenticationLocalPreShare;
            return this;
        }

        /**
         * @param authenticationLocalPreShare Pre-Shared Key
         * 
         * @return builder
         * 
         */
        public Builder authenticationLocalPreShare(Boolean authenticationLocalPreShare) {
            return authenticationLocalPreShare(Output.of(authenticationLocalPreShare));
        }

        /**
         * @param authenticationRemotePreShare Pre-Shared Key
         * 
         * @return builder
         * 
         */
        public Builder authenticationRemotePreShare(@Nullable Output<Boolean> authenticationRemotePreShare) {
            $.authenticationRemotePreShare = authenticationRemotePreShare;
            return this;
        }

        /**
         * @param authenticationRemotePreShare Pre-Shared Key
         * 
         * @return builder
         * 
         */
        public Builder authenticationRemotePreShare(Boolean authenticationRemotePreShare) {
            return authenticationRemotePreShare(Output.of(authenticationRemotePreShare));
        }

        /**
         * @param configExchangeRequest enable config-exchange request
         * 
         * @return builder
         * 
         */
        public Builder configExchangeRequest(@Nullable Output<Boolean> configExchangeRequest) {
            $.configExchangeRequest = configExchangeRequest;
            return this;
        }

        /**
         * @param configExchangeRequest enable config-exchange request
         * 
         * @return builder
         * 
         */
        public Builder configExchangeRequest(Boolean configExchangeRequest) {
            return configExchangeRequest(Output.of(configExchangeRequest));
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
         * @param description Specify a description of this profile
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specify a description of this profile
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
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
         * @param dpdInterval - Range: `10`-`3600`
         * 
         * @return builder
         * 
         */
        public Builder dpdInterval(@Nullable Output<Integer> dpdInterval) {
            $.dpdInterval = dpdInterval;
            return this;
        }

        /**
         * @param dpdInterval - Range: `10`-`3600`
         * 
         * @return builder
         * 
         */
        public Builder dpdInterval(Integer dpdInterval) {
            return dpdInterval(Output.of(dpdInterval));
        }

        /**
         * @param dpdQuery - Choices: `on-demand`, `periodic`
         * 
         * @return builder
         * 
         */
        public Builder dpdQuery(@Nullable Output<String> dpdQuery) {
            $.dpdQuery = dpdQuery;
            return this;
        }

        /**
         * @param dpdQuery - Choices: `on-demand`, `periodic`
         * 
         * @return builder
         * 
         */
        public Builder dpdQuery(String dpdQuery) {
            return dpdQuery(Output.of(dpdQuery));
        }

        /**
         * @param dpdRetry - Range: `2`-`60`
         * 
         * @return builder
         * 
         */
        public Builder dpdRetry(@Nullable Output<Integer> dpdRetry) {
            $.dpdRetry = dpdRetry;
            return this;
        }

        /**
         * @param dpdRetry - Range: `2`-`60`
         * 
         * @return builder
         * 
         */
        public Builder dpdRetry(Integer dpdRetry) {
            return dpdRetry(Output.of(dpdRetry));
        }

        /**
         * @param identityLocalAddress address
         * 
         * @return builder
         * 
         */
        public Builder identityLocalAddress(@Nullable Output<String> identityLocalAddress) {
            $.identityLocalAddress = identityLocalAddress;
            return this;
        }

        /**
         * @param identityLocalAddress address
         * 
         * @return builder
         * 
         */
        public Builder identityLocalAddress(String identityLocalAddress) {
            return identityLocalAddress(Output.of(identityLocalAddress));
        }

        /**
         * @param identityLocalKeyId key-id opaque string - proprietary types of identification key-id string
         * 
         * @return builder
         * 
         */
        public Builder identityLocalKeyId(@Nullable Output<String> identityLocalKeyId) {
            $.identityLocalKeyId = identityLocalKeyId;
            return this;
        }

        /**
         * @param identityLocalKeyId key-id opaque string - proprietary types of identification key-id string
         * 
         * @return builder
         * 
         */
        public Builder identityLocalKeyId(String identityLocalKeyId) {
            return identityLocalKeyId(Output.of(identityLocalKeyId));
        }

        /**
         * @param keyringLocal Keyring name
         * 
         * @return builder
         * 
         */
        public Builder keyringLocal(@Nullable Output<String> keyringLocal) {
            $.keyringLocal = keyringLocal;
            return this;
        }

        /**
         * @param keyringLocal Keyring name
         * 
         * @return builder
         * 
         */
        public Builder keyringLocal(String keyringLocal) {
            return keyringLocal(Output.of(keyringLocal));
        }

        public Builder matchAddressLocalIp(@Nullable Output<String> matchAddressLocalIp) {
            $.matchAddressLocalIp = matchAddressLocalIp;
            return this;
        }

        public Builder matchAddressLocalIp(String matchAddressLocalIp) {
            return matchAddressLocalIp(Output.of(matchAddressLocalIp));
        }

        public Builder matchFvrf(@Nullable Output<String> matchFvrf) {
            $.matchFvrf = matchFvrf;
            return this;
        }

        public Builder matchFvrf(String matchFvrf) {
            return matchFvrf(Output.of(matchFvrf));
        }

        /**
         * @param matchFvrfAny Any fvrf
         * 
         * @return builder
         * 
         */
        public Builder matchFvrfAny(@Nullable Output<Boolean> matchFvrfAny) {
            $.matchFvrfAny = matchFvrfAny;
            return this;
        }

        /**
         * @param matchFvrfAny Any fvrf
         * 
         * @return builder
         * 
         */
        public Builder matchFvrfAny(Boolean matchFvrfAny) {
            return matchFvrfAny(Output.of(matchFvrfAny));
        }

        public Builder matchIdentityRemoteIpv4Addresses(@Nullable Output<List<CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs>> matchIdentityRemoteIpv4Addresses) {
            $.matchIdentityRemoteIpv4Addresses = matchIdentityRemoteIpv4Addresses;
            return this;
        }

        public Builder matchIdentityRemoteIpv4Addresses(List<CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs> matchIdentityRemoteIpv4Addresses) {
            return matchIdentityRemoteIpv4Addresses(Output.of(matchIdentityRemoteIpv4Addresses));
        }

        public Builder matchIdentityRemoteIpv4Addresses(CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs... matchIdentityRemoteIpv4Addresses) {
            return matchIdentityRemoteIpv4Addresses(List.of(matchIdentityRemoteIpv4Addresses));
        }

        public Builder matchIdentityRemoteIpv6Prefixes(@Nullable Output<List<String>> matchIdentityRemoteIpv6Prefixes) {
            $.matchIdentityRemoteIpv6Prefixes = matchIdentityRemoteIpv6Prefixes;
            return this;
        }

        public Builder matchIdentityRemoteIpv6Prefixes(List<String> matchIdentityRemoteIpv6Prefixes) {
            return matchIdentityRemoteIpv6Prefixes(Output.of(matchIdentityRemoteIpv6Prefixes));
        }

        public Builder matchIdentityRemoteIpv6Prefixes(String... matchIdentityRemoteIpv6Prefixes) {
            return matchIdentityRemoteIpv6Prefixes(List.of(matchIdentityRemoteIpv6Prefixes));
        }

        /**
         * @param matchIdentityRemoteKeys key-id opaque string
         * 
         * @return builder
         * 
         */
        public Builder matchIdentityRemoteKeys(@Nullable Output<List<String>> matchIdentityRemoteKeys) {
            $.matchIdentityRemoteKeys = matchIdentityRemoteKeys;
            return this;
        }

        /**
         * @param matchIdentityRemoteKeys key-id opaque string
         * 
         * @return builder
         * 
         */
        public Builder matchIdentityRemoteKeys(List<String> matchIdentityRemoteKeys) {
            return matchIdentityRemoteKeys(Output.of(matchIdentityRemoteKeys));
        }

        /**
         * @param matchIdentityRemoteKeys key-id opaque string
         * 
         * @return builder
         * 
         */
        public Builder matchIdentityRemoteKeys(String... matchIdentityRemoteKeys) {
            return matchIdentityRemoteKeys(List.of(matchIdentityRemoteKeys));
        }

        /**
         * @param matchInboundOnly Match the profile for incoming connections only
         * 
         * @return builder
         * 
         */
        public Builder matchInboundOnly(@Nullable Output<Boolean> matchInboundOnly) {
            $.matchInboundOnly = matchInboundOnly;
            return this;
        }

        /**
         * @param matchInboundOnly Match the profile for incoming connections only
         * 
         * @return builder
         * 
         */
        public Builder matchInboundOnly(Boolean matchInboundOnly) {
            return matchInboundOnly(Output.of(matchInboundOnly));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CryptoIkev2ProfileState build() {
            return $;
        }
    }

}
