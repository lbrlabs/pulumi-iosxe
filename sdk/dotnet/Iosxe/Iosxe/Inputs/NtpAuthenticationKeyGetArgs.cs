// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe.Inputs
{

    public sealed class NtpAuthenticationKeyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cmacAes128")]
        public Input<string>? CmacAes128 { get; set; }

        [Input("encryptionType")]
        public Input<int>? EncryptionType { get; set; }

        [Input("hmacSha1")]
        public Input<string>? HmacSha1 { get; set; }

        [Input("hmacSha2256")]
        public Input<string>? HmacSha2256 { get; set; }

        [Input("md5")]
        public Input<string>? Md5 { get; set; }

        [Input("number", required: true)]
        public Input<int> Number { get; set; } = null!;

        [Input("sha1")]
        public Input<string>? Sha1 { get; set; }

        [Input("sha2")]
        public Input<string>? Sha2 { get; set; }

        public NtpAuthenticationKeyGetArgs()
        {
        }
        public static new NtpAuthenticationKeyGetArgs Empty => new NtpAuthenticationKeyGetArgs();
    }
}
