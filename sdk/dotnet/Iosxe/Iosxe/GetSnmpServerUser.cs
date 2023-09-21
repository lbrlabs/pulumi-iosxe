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
    public static class GetSnmpServerUser
    {
        public static Task<GetSnmpServerUserResult> InvokeAsync(GetSnmpServerUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSnmpServerUserResult>("iosxe:iosxe/getSnmpServerUser:getSnmpServerUser", args ?? new GetSnmpServerUserArgs(), options.WithDefaults());

        public static Output<GetSnmpServerUserResult> Invoke(GetSnmpServerUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnmpServerUserResult>("iosxe:iosxe/getSnmpServerUser:getSnmpServerUser", args ?? new GetSnmpServerUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSnmpServerUserArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("grpname", required: true)]
        public string Grpname { get; set; } = null!;

        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetSnmpServerUserArgs()
        {
        }
        public static new GetSnmpServerUserArgs Empty => new GetSnmpServerUserArgs();
    }

    public sealed class GetSnmpServerUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("grpname", required: true)]
        public Input<string> Grpname { get; set; } = null!;

        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public GetSnmpServerUserInvokeArgs()
        {
        }
        public static new GetSnmpServerUserInvokeArgs Empty => new GetSnmpServerUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetSnmpServerUserResult
    {
        public readonly string? Device;
        public readonly string Grpname;
        public readonly string Id;
        public readonly string Username;
        public readonly string V3AuthAccessAclName;
        public readonly string V3AuthAccessIpv6Acl;
        public readonly int V3AuthAccessStandardAcl;
        public readonly string V3AuthAlgorithm;
        public readonly string V3AuthPassword;
        public readonly string V3AuthPrivAesAccessAclName;
        public readonly string V3AuthPrivAesAccessIpv6Acl;
        public readonly int V3AuthPrivAesAccessStandardAcl;
        public readonly string V3AuthPrivAesAlgorithm;
        public readonly string V3AuthPrivAesPassword;
        public readonly string V3AuthPrivDes3AccessAclName;
        public readonly string V3AuthPrivDes3AccessIpv6Acl;
        public readonly int V3AuthPrivDes3AccessStandardAcl;
        public readonly string V3AuthPrivDes3Password;
        public readonly string V3AuthPrivDesAccessAclName;
        public readonly string V3AuthPrivDesAccessIpv6Acl;
        public readonly int V3AuthPrivDesAccessStandardAcl;
        public readonly string V3AuthPrivDesPassword;

        [OutputConstructor]
        private GetSnmpServerUserResult(
            string? device,

            string grpname,

            string id,

            string username,

            string v3AuthAccessAclName,

            string v3AuthAccessIpv6Acl,

            int v3AuthAccessStandardAcl,

            string v3AuthAlgorithm,

            string v3AuthPassword,

            string v3AuthPrivAesAccessAclName,

            string v3AuthPrivAesAccessIpv6Acl,

            int v3AuthPrivAesAccessStandardAcl,

            string v3AuthPrivAesAlgorithm,

            string v3AuthPrivAesPassword,

            string v3AuthPrivDes3AccessAclName,

            string v3AuthPrivDes3AccessIpv6Acl,

            int v3AuthPrivDes3AccessStandardAcl,

            string v3AuthPrivDes3Password,

            string v3AuthPrivDesAccessAclName,

            string v3AuthPrivDesAccessIpv6Acl,

            int v3AuthPrivDesAccessStandardAcl,

            string v3AuthPrivDesPassword)
        {
            Device = device;
            Grpname = grpname;
            Id = id;
            Username = username;
            V3AuthAccessAclName = v3AuthAccessAclName;
            V3AuthAccessIpv6Acl = v3AuthAccessIpv6Acl;
            V3AuthAccessStandardAcl = v3AuthAccessStandardAcl;
            V3AuthAlgorithm = v3AuthAlgorithm;
            V3AuthPassword = v3AuthPassword;
            V3AuthPrivAesAccessAclName = v3AuthPrivAesAccessAclName;
            V3AuthPrivAesAccessIpv6Acl = v3AuthPrivAesAccessIpv6Acl;
            V3AuthPrivAesAccessStandardAcl = v3AuthPrivAesAccessStandardAcl;
            V3AuthPrivAesAlgorithm = v3AuthPrivAesAlgorithm;
            V3AuthPrivAesPassword = v3AuthPrivAesPassword;
            V3AuthPrivDes3AccessAclName = v3AuthPrivDes3AccessAclName;
            V3AuthPrivDes3AccessIpv6Acl = v3AuthPrivDes3AccessIpv6Acl;
            V3AuthPrivDes3AccessStandardAcl = v3AuthPrivDes3AccessStandardAcl;
            V3AuthPrivDes3Password = v3AuthPrivDes3Password;
            V3AuthPrivDesAccessAclName = v3AuthPrivDesAccessAclName;
            V3AuthPrivDesAccessIpv6Acl = v3AuthPrivDesAccessIpv6Acl;
            V3AuthPrivDesAccessStandardAcl = v3AuthPrivDesAccessStandardAcl;
            V3AuthPrivDesPassword = v3AuthPrivDesPassword;
        }
    }
}
