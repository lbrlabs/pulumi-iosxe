// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe
{
    public static class GetClassMap
    {
        /// <summary>
        /// This data source can read the Class Map configuration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Iosxe = Pulumi.Iosxe;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Iosxe.GetClassMap.Invoke(new()
        ///     {
        ///         Name = "CM1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClassMapResult> InvokeAsync(GetClassMapArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClassMapResult>("iosxe:index/getClassMap:getClassMap", args ?? new GetClassMapArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Class Map configuration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Iosxe = Pulumi.Iosxe;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Iosxe.GetClassMap.Invoke(new()
        ///     {
        ///         Name = "CM1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetClassMapResult> Invoke(GetClassMapInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClassMapResult>("iosxe:index/getClassMap:getClassMap", args ?? new GetClassMapInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClassMapArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        /// <summary>
        /// name of the class map
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClassMapArgs()
        {
        }
        public static new GetClassMapArgs Empty => new GetClassMapArgs();
    }

    public sealed class GetClassMapInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// name of the class map
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetClassMapInvokeArgs()
        {
        }
        public static new GetClassMapInvokeArgs Empty => new GetClassMapInvokeArgs();
    }


    [OutputType]
    public sealed class GetClassMapResult
    {
        /// <summary>
        /// Class-Map description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// match name of service template activated on session
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClassMapMatchActivatedServiceTemplateResult> MatchActivatedServiceTemplates;
        /// <summary>
        /// authorized
        /// </summary>
        public readonly bool MatchAuthorizationStatusAuthorized;
        /// <summary>
        /// unauthorized
        /// </summary>
        public readonly bool MatchAuthorizationStatusUnauthorized;
        /// <summary>
        /// greater than
        /// </summary>
        public readonly ImmutableArray<int> MatchAuthorizingMethodPriorityGreaterThans;
        /// <summary>
        /// dot1x
        /// </summary>
        public readonly bool MatchMethodDot1x;
        /// <summary>
        /// mab
        /// </summary>
        public readonly bool MatchMethodMab;
        /// <summary>
        /// aaa timeout type
        /// </summary>
        public readonly bool MatchResultTypeAaaTimeout;
        /// <summary>
        /// agent not found type
        /// </summary>
        public readonly bool MatchResultTypeMethodDot1xAgentNotFound;
        /// <summary>
        /// failure type
        /// </summary>
        public readonly bool MatchResultTypeMethodDot1xAuthoritative;
        /// <summary>
        /// method_timeout type
        /// </summary>
        public readonly bool MatchResultTypeMethodDot1xMethodTimeout;
        /// <summary>
        /// failure type
        /// </summary>
        public readonly bool MatchResultTypeMethodMabAuthoritative;
        /// <summary>
        /// name of the class map
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Logical-AND/Logical-OR of all matching statements under this class map
        /// </summary>
        public readonly string Prematch;
        /// <summary>
        /// Domain name of the class map
        /// </summary>
        public readonly bool Subscriber;
        /// <summary>
        /// type of the class-map
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetClassMapResult(
            string description,

            string? device,

            string id,

            ImmutableArray<Outputs.GetClassMapMatchActivatedServiceTemplateResult> matchActivatedServiceTemplates,

            bool matchAuthorizationStatusAuthorized,

            bool matchAuthorizationStatusUnauthorized,

            ImmutableArray<int> matchAuthorizingMethodPriorityGreaterThans,

            bool matchMethodDot1x,

            bool matchMethodMab,

            bool matchResultTypeAaaTimeout,

            bool matchResultTypeMethodDot1xAgentNotFound,

            bool matchResultTypeMethodDot1xAuthoritative,

            bool matchResultTypeMethodDot1xMethodTimeout,

            bool matchResultTypeMethodMabAuthoritative,

            string name,

            string prematch,

            bool subscriber,

            string type)
        {
            Description = description;
            Device = device;
            Id = id;
            MatchActivatedServiceTemplates = matchActivatedServiceTemplates;
            MatchAuthorizationStatusAuthorized = matchAuthorizationStatusAuthorized;
            MatchAuthorizationStatusUnauthorized = matchAuthorizationStatusUnauthorized;
            MatchAuthorizingMethodPriorityGreaterThans = matchAuthorizingMethodPriorityGreaterThans;
            MatchMethodDot1x = matchMethodDot1x;
            MatchMethodMab = matchMethodMab;
            MatchResultTypeAaaTimeout = matchResultTypeAaaTimeout;
            MatchResultTypeMethodDot1xAgentNotFound = matchResultTypeMethodDot1xAgentNotFound;
            MatchResultTypeMethodDot1xAuthoritative = matchResultTypeMethodDot1xAuthoritative;
            MatchResultTypeMethodDot1xMethodTimeout = matchResultTypeMethodDot1xMethodTimeout;
            MatchResultTypeMethodMabAuthoritative = matchResultTypeMethodMabAuthoritative;
            Name = name;
            Prematch = prematch;
            Subscriber = subscriber;
            Type = type;
        }
    }
}
