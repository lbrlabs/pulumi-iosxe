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
    public static class GetCryptoIpsecProfile
    {
        public static Task<GetCryptoIpsecProfileResult> InvokeAsync(GetCryptoIpsecProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCryptoIpsecProfileResult>("iosxe:iosxe/getCryptoIpsecProfile:getCryptoIpsecProfile", args ?? new GetCryptoIpsecProfileArgs(), options.WithDefaults());

        public static Output<GetCryptoIpsecProfileResult> Invoke(GetCryptoIpsecProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCryptoIpsecProfileResult>("iosxe:iosxe/getCryptoIpsecProfile:getCryptoIpsecProfile", args ?? new GetCryptoIpsecProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCryptoIpsecProfileArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCryptoIpsecProfileArgs()
        {
        }
        public static new GetCryptoIpsecProfileArgs Empty => new GetCryptoIpsecProfileArgs();
    }

    public sealed class GetCryptoIpsecProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetCryptoIpsecProfileInvokeArgs()
        {
        }
        public static new GetCryptoIpsecProfileInvokeArgs Empty => new GetCryptoIpsecProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetCryptoIpsecProfileResult
    {
        public readonly string? Device;
        public readonly string Id;
        public readonly string Name;
        public readonly string SetIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile;
        public readonly string SetIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile;
        public readonly ImmutableArray<string> SetTransformSets;

        [OutputConstructor]
        private GetCryptoIpsecProfileResult(
            string? device,

            string id,

            string name,

            string setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile,

            string setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile,

            ImmutableArray<string> setTransformSets)
        {
            Device = device;
            Id = id;
            Name = name;
            SetIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile = setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile;
            SetIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile = setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile;
            SetTransformSets = setTransformSets;
        }
    }
}
