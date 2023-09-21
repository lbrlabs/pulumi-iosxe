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
    [IosxeResourceType("iosxe:iosxe/cryptoIpsecTransformSet:CryptoIpsecTransformSet")]
    public partial class CryptoIpsecTransformSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        /// </summary>
        [Output("esp")]
        public Output<string> Esp { get; private set; } = null!;

        /// <summary>
        /// - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        /// </summary>
        [Output("espHmac")]
        public Output<string> EspHmac { get; private set; } = null!;

        /// <summary>
        /// tunnel (datagram encapsulation) mode
        /// </summary>
        [Output("modeTunnel")]
        public Output<bool?> ModeTunnel { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a CryptoIpsecTransformSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CryptoIpsecTransformSet(string name, CryptoIpsecTransformSetArgs args, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/cryptoIpsecTransformSet:CryptoIpsecTransformSet", name, args ?? new CryptoIpsecTransformSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CryptoIpsecTransformSet(string name, Input<string> id, CryptoIpsecTransformSetState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/cryptoIpsecTransformSet:CryptoIpsecTransformSet", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CryptoIpsecTransformSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CryptoIpsecTransformSet Get(string name, Input<string> id, CryptoIpsecTransformSetState? state = null, CustomResourceOptions? options = null)
        {
            return new CryptoIpsecTransformSet(name, id, state, options);
        }
    }

    public sealed class CryptoIpsecTransformSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        /// </summary>
        [Input("esp", required: true)]
        public Input<string> Esp { get; set; } = null!;

        /// <summary>
        /// - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        /// </summary>
        [Input("espHmac", required: true)]
        public Input<string> EspHmac { get; set; } = null!;

        /// <summary>
        /// tunnel (datagram encapsulation) mode
        /// </summary>
        [Input("modeTunnel")]
        public Input<bool>? ModeTunnel { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public CryptoIpsecTransformSetArgs()
        {
        }
        public static new CryptoIpsecTransformSetArgs Empty => new CryptoIpsecTransformSetArgs();
    }

    public sealed class CryptoIpsecTransformSetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        /// </summary>
        [Input("esp")]
        public Input<string>? Esp { get; set; }

        /// <summary>
        /// - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        /// </summary>
        [Input("espHmac")]
        public Input<string>? EspHmac { get; set; }

        /// <summary>
        /// tunnel (datagram encapsulation) mode
        /// </summary>
        [Input("modeTunnel")]
        public Input<bool>? ModeTunnel { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public CryptoIpsecTransformSetState()
        {
        }
        public static new CryptoIpsecTransformSetState Empty => new CryptoIpsecTransformSetState();
    }
}