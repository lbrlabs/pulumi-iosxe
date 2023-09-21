// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe
{
    public static class GetCryptoIkev2Profile
    {
        public static Task<GetCryptoIkev2ProfileResult> InvokeAsync(GetCryptoIkev2ProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCryptoIkev2ProfileResult>("iosxe:iosxe/getCryptoIkev2Profile:getCryptoIkev2Profile", args ?? new GetCryptoIkev2ProfileArgs(), options.WithDefaults());

        public static Output<GetCryptoIkev2ProfileResult> Invoke(GetCryptoIkev2ProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCryptoIkev2ProfileResult>("iosxe:iosxe/getCryptoIkev2Profile:getCryptoIkev2Profile", args ?? new GetCryptoIkev2ProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCryptoIkev2ProfileArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCryptoIkev2ProfileArgs()
        {
        }
        public static new GetCryptoIkev2ProfileArgs Empty => new GetCryptoIkev2ProfileArgs();
    }

    public sealed class GetCryptoIkev2ProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetCryptoIkev2ProfileInvokeArgs()
        {
        }
        public static new GetCryptoIkev2ProfileInvokeArgs Empty => new GetCryptoIkev2ProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetCryptoIkev2ProfileResult
    {
        public readonly bool AuthenticationLocalPreShare;
        public readonly bool AuthenticationRemotePreShare;
        public readonly bool ConfigExchangeRequest;
        public readonly string Description;
        public readonly string? Device;
        public readonly int DpdInterval;
        public readonly string DpdQuery;
        public readonly int DpdRetry;
        public readonly string Id;
        public readonly string IdentityLocalAddress;
        public readonly string IdentityLocalKeyId;
        public readonly string KeyringLocal;
        public readonly string MatchAddressLocalIp;
        public readonly string MatchFvrf;
        public readonly bool MatchFvrfAny;
        public readonly ImmutableArray<Outputs.GetCryptoIkev2ProfileMatchIdentityRemoteIpv4AddressResult> MatchIdentityRemoteIpv4Addresses;
        public readonly ImmutableArray<string> MatchIdentityRemoteIpv6Prefixes;
        public readonly ImmutableArray<string> MatchIdentityRemoteKeys;
        public readonly bool MatchInboundOnly;
        public readonly string Name;

        [OutputConstructor]
        private GetCryptoIkev2ProfileResult(
            bool authenticationLocalPreShare,

            bool authenticationRemotePreShare,

            bool configExchangeRequest,

            string description,

            string? device,

            int dpdInterval,

            string dpdQuery,

            int dpdRetry,

            string id,

            string identityLocalAddress,

            string identityLocalKeyId,

            string keyringLocal,

            string matchAddressLocalIp,

            string matchFvrf,

            bool matchFvrfAny,

            ImmutableArray<Outputs.GetCryptoIkev2ProfileMatchIdentityRemoteIpv4AddressResult> matchIdentityRemoteIpv4Addresses,

            ImmutableArray<string> matchIdentityRemoteIpv6Prefixes,

            ImmutableArray<string> matchIdentityRemoteKeys,

            bool matchInboundOnly,

            string name)
        {
            AuthenticationLocalPreShare = authenticationLocalPreShare;
            AuthenticationRemotePreShare = authenticationRemotePreShare;
            ConfigExchangeRequest = configExchangeRequest;
            Description = description;
            Device = device;
            DpdInterval = dpdInterval;
            DpdQuery = dpdQuery;
            DpdRetry = dpdRetry;
            Id = id;
            IdentityLocalAddress = identityLocalAddress;
            IdentityLocalKeyId = identityLocalKeyId;
            KeyringLocal = keyringLocal;
            MatchAddressLocalIp = matchAddressLocalIp;
            MatchFvrf = matchFvrf;
            MatchFvrfAny = matchFvrfAny;
            MatchIdentityRemoteIpv4Addresses = matchIdentityRemoteIpv4Addresses;
            MatchIdentityRemoteIpv6Prefixes = matchIdentityRemoteIpv6Prefixes;
            MatchIdentityRemoteKeys = matchIdentityRemoteKeys;
            MatchInboundOnly = matchInboundOnly;
            Name = name;
        }
    }
}
